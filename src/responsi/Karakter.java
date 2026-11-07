package responsi;

public abstract class Karakter {
    public static final int HP_MAKSIMAL = 100;

    private final String id;
    private String nama;
    private int hp;
    private int mana;

    public Karakter(String id, String nama) {
        this(id, nama, HP_MAKSIMAL, 50);
    }

    public Karakter(String id, String nama, int hp, int mana) {
        this.id = id;
        this.nama = nama;
        this.hp = hp;
        this.mana = mana;
    }

    public String getId() { return id; }
    public String getNama() { return nama; }
    public int getHp() { return hp; }
    public int getMana() { return mana; }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHp(int hp) {
        if (hp > HP_MAKSIMAL) {
            this.hp = HP_MAKSIMAL;
        } else if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public void setMana(int mana) {
        if (mana < 0) {
            this.mana = 0;
        } else {
            this.mana = mana;
        }
    }

    public void terimaDamage(int damage) {
        if (masihHidup()) {
            setHp(hp - damage);
            System.out.println(nama + " terkena " + damage
                    + " damage, sisa HP: " + hp);

            if (!masihHidup()) {
                System.out.println(nama + " telah kalah yahahahah!");
            }
        }
    }

    public void tampilkanStatus() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("HP: " + hp);
        System.out.println("Mana: " + mana);
    }

    public boolean masihHidup() {
        return hp > 0;
    }

    public int hitungDayaSerang() {
        return 10;
    }

    public abstract void gunakanSkill();
}
