public class Main {
    public static void main(String[] args) {
        Hero alucard = new Hero("H01", "Alucard", 15);
        Hero eudora = new Hero("H02", "Eudora", 20);
        Enemy lord = new Enemy("E01", "Lord", 5);

        System.out.println("STATUS AWAL");
        alucard.tampilkanStatus();
        System.out.println();
        eudora.tampilkanStatus();
        System.out.println();
        lord.tampilkanStatus();

        System.out.println("\nPERTARUNGAN");

        Karakter karakterLord = lord;
        karakterLord.gunakanSkill();

        Penyerang penyerangLord = lord;
        Penyerang penyerangAlucard = alucard;
        Penyembuh penyembuhEudora = eudora;

        penyerangLord.serang(alucard);

        if (alucard.masihHidup()) {
            penyembuhEudora.sembuhkan(alucard);
        }

        while (alucard.masihHidup() && lord.masihHidup()) {
            penyerangLord.serang(alucard);

            if (alucard.masihHidup()) {
                alucard.gunakanSkill();
                penyerangAlucard.serang(lord);
            }
        }

        if (!alucard.masihHidup() && !lord.masihHidup()) {
            System.out.println("\nHASIL: SERI");
        } else if (alucard.masihHidup()) {
            System.out.println("\nTHE WINNER: HERO");
        } else {
            System.out.println("\nTHE WINNER: ENEMY");
        }

        System.out.println("\nSTATUS AKHIR");
        alucard.tampilkanStatus();
        System.out.println();
        eudora.tampilkanStatus();
        System.out.println();
        lord.tampilkanStatus();
    }
}
