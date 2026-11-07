public class Enemy extends Karakter implements Penyerang {
    private int kekuatan;

    public Enemy(String id, String nama, int kekuatan) {
        super(id, nama);
        this.kekuatan = kekuatan;
    }

    public int getKekuatan() { return kekuatan; }
    public void setKekuatan(int kekuatan) { this.kekuatan = kekuatan; }

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
        if (getMana() >= 10) {
            setMana(getMana() - 10);
            kekuatan = kekuatan + 5;
            System.out.println(getNama() + " mengamuk, kekuatan +5");
        } else {
            System.out.println(getNama() + " gagal mengamuk: mana kurang");
        }
    }

    @Override
    public void serang(Karakter target) {
        System.out.println(getNama() + " menyerang " + target.getNama());
        target.terimaDamage(hitungDayaSerang());
    }
}