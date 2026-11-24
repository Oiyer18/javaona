package Entregatzeko;

import java.util.Scanner;

public class Poke {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int przArroza = 6, przEnstsalada = 4, przQuinoa = 7, auk = 0, n = 0, prezIra = 5, prezfresk = 3, prezauk = 0;
        double prez = 0, prezura = 1.5, prezauk2 = 0;
        String izena = "", tlf = "", gehi = "", aukera = "", aukera2 = "", konfir = "ez", bestebat = "bai", edari = "";
        while (bestebat.equals("bai")) {
            konfir = "ez";
            while (konfir.equals("ez")) {
                auk = 0;
                n = 0;
                prez = 0;
                izena = "";
                tlf = "";
                gehi = "";
                aukera = "";
                aukera2 = "";
                prezauk2 = 0;
                System.out.println("Ongi etorri poke jatetxera\n Zein da zure izena?");
                izena = sc.next();
                while (tlf.length() != 9) {
                    System.out.println("Zein da zure telefonoa?");
                    tlf = sc.next();
                    if (tlf.length() != 9) {
                        System.out.println("Sartu duzun tlf zenbakia ez du balio, mesedez ondo sartu.");
                    }
                }
                System.out.println(
                        "========== OINARRIA ==========\n1. Arroz oinarria     6 €\n2. Entsalada          4 €\n3. Quinoa             7 €\n==============================\nAukeratu oinarria:");
                while (auk < 1 || auk > 3) {
                    auk = sc.nextInt();
                    if (auk < 1 || auk > 3) {
                        System.out.println("Ez da baliozko aukera bat, mesedez ondo aukeratu.");
                    }
                }
                sc.nextLine();
                switch (auk) {
                    case 1:
                        prez = prez + przArroza;
                        aukera = "Arroza";
                        prezauk = przArroza;
                        break;
                    case 2:
                        prez = prez + przEnstsalada;
                        aukera = "Entsalada";
                        prezauk = przEnstsalada;
                        break;
                    case 3:
                        prez = prez + przQuinoa;
                        aukera = "Quinoa";
                        prezauk = przQuinoa;
                        break;
                }
                System.out.println(
                        "Zein gehigarri nahi dituzu? (Idatzi komarekin banatua) gehigarri bakoitzak 0,5$ gehiago dira, ez nahi badezu ezer idatzi enter eman.");
                gehi = sc.nextLine();
                if (gehi.equals("")) {
                    n = 0;
                } else {
                    for (int i = 0; i < gehi.length(); i++) {
                        if (gehi.charAt(i) == ',') {
                            n++;
                        }
                    }
                    if (gehi.indexOf("eta") >= 0) {
                        n++;
                    }
                    n++;
                    prez = prez + (0.5 * n);
                }
                System.out.println("Edaririk nahi?");
                edari = sc.next();
                if (edari.equals("bai")) {
                    System.out.println(
                            "========== EDARIA ==========\n1. Ura                     1,5$\n2. Freskagarria              3$\n3. Irabiatua                  5$\n=============================");
                    auk = 0;
                    while (auk < 1 || auk > 3) {
                        auk = sc.nextInt();
                        if (auk < 1 || auk > 3) {
                            System.out.println("Sartutako aukera ez da egokia, mesedez sartu aukera onargarri bat.");
                        }
                    }
                    switch (auk) {
                        case 1:
                            prez = prez + prezura;
                            aukera2 = "Ura";
                            prezauk2 = prezura;
                            break;

                        case 2:
                            prez = prez + prezfresk;
                            aukera2 = "Freskagarria";
                            prezauk2 = prezfresk;
                            break;
                        case 3:
                            prez = prez + prezIra;
                            aukera2 = "Irabiatua";
                            prezauk2 = prezIra;
                            break;
                    }
                } else {
                    aukera2 = "Edaririk ez";
                }
                System.out.println("Ondo dago eskaera?");
                konfir = sc.next();
            }
            System.out.println(
                    "===================================\n               ZURE POKEA            \n===================================\n Bezeroa:"
                            + izena + "\n\n Oinarria:" + aukera + "------------" + prezauk + "$\n Gehigarriak: " + n
                            + " x 0,5---------" + (n * 0.5) + "$\n" + " " + aukera2 + "----------------------"
                            + prezauk2
                            + "$\n\n------------------------------------\n GUZTIRA----------------" + prez
                            + "$\n====================================\n Eskerrik asko, " + izena + "!");

            System.out.println("Beste eskaera bat egin nahi dezu?");
            bestebat = sc.next();
        }
        sc.close();
    }
}
