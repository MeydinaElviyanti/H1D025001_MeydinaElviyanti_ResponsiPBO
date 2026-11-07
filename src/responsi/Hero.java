package responsi;

public class Hero extends Karakter implements Penyerang, Penyembuh {
    private int kekuatan;

    public Hero(String id, String nama, int kekuatan) {
        super(id, nama, 100, 100);
        this.kekuatan = kekuatan;
    }

    public int getKekuatan() {
        return kekuatan;
    }

    public void setKekuatan(int kekuatan) {
        this.kekuatan = kekuatan;
    }

    @Override
    public int hitungDayaSerang() {
        return super.hitungDayaSerang() + kekuatan;
    }

    @Override
    public void tampilkanStatus() {
        super.tampilkanStatus();
        System.out.println("Kekuatan: " + kekuatan);
    }

    @Override
    public void gunakanSkill() {
        sembuhkan(this);
    }

    @Override
    public void serang(Karakter target) {
        if (masihHidup() && target.masihHidup()) {
            System.out.println(getNama() + " menyerang " + target.getNama());
            target.terimaDamage(hitungDayaSerang());
        }
    }

    @Override
    public void sembuhkan(Hero target) {
        if (!masihHidup()) {
            System.out.println(getNama() + " sudah kalah");
        } else if (!target.masihHidup()) {
            System.out.println(target.getNama() + " sudah kalah dan tidak bisa disembuhkan");
        } else if (getMana() < 10) {
            System.out.println(getNama() + " tidak cukup mana untuk menyembuhkan");
        } else if (target.getHp() >= HP_MAKSIMAL) {
            System.out.println(target.getNama() + " memiliki HP maksimal");
        } else {
            int hpAwal = target.getHp();

            setMana(getMana() - 10);
            target.setHp(target.getHp() + 20);

            int tambahanHp = target.getHp() - hpAwal;

            System.out.println(getNama() + " menyembuhkan "
                    + target.getNama() + " (+" + tambahanHp + " HP)");
        }
    }
}
