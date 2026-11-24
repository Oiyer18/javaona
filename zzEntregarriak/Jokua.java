package zzEntregarriak;

import java.util.Arrays;

public class Jokua {
    public static void main(String[] args) {
        int Partidak[][] = new int[3][10];
        int estadistikak[] = new int[3];
        int partidakont = 0;
        // while bat 3 partida jolastu arte
        while (partidakont < 3) {
            // PARTIDAK JOLASTEN HASI
            System.out.println("\n" + (partidakont + 1) + ". Partida:----------------------");
            // PARTIDA JOLASTU ETA BALIOAK ESLEITU
            Arrays.fill(Partidak[partidakont], 0);
            // MATRIZEAN GORDE
            Partidak[partidakont] = Arrays.copyOf(Partidajolastu(Partidak[partidakont]), 10);
            System.out.println(Arrays.toString(Partidak[partidakont]));
            // ESTADISTIKAK KALKULATU ETA GORDE
            estadistikak[partidakont] = Estatistikalkulatu(Partidak[partidakont]);
            System.out.println("Partidan lortutako puntuak: " + estadistikak[partidakont]);
            // JARRI EA ZENBAT PUNTU LORTU DITUZUN ETA EA HOBETO DUZUN
            if (partidakont != 0) {
                if (estadistikak[partidakont] == estadistikak[partidakont - 1]) {
                    // ORAINGO PARTIDAN ETA AZKENEKO PARTIDAN PUNTU BERDINAK LORTU BALDIN BADIRA
                    int erantzunak = Arrays.compare(Partidak[partidakont], Partidak[partidakont - 1]);
                    // BI PARTIDAK BERDINAK
                    if (erantzunak == 0) {
                        System.out.println("\n-----Azkeneko partidaren puntu berdinak egin dituzu!!-----");
                    }
                    // BIGARREN SAIAKERA TXARRAGOA
                    else if (erantzunak > 0) {
                        System.out.println("\n-----Emaitza txarragoak lortu dituzu oraingoan-----");
                    }
                    // BIGARREN SAIAKERA HOBEAGOA
                    else if (erantzunak < 0) {
                        System.out.println("\n-----Erantzuna hobeagoak egin dituzu oraingoan, ZORIONAK!!-----");
                    }
                }
                // BI PARTIDETAN PUNTUAZIO EZBERDINAK
                else if (estadistikak[partidakont] > estadistikak[partidakont - 1]) {
                    System.out.println("\n-----ZORIONAK!! Hobetu duzu-----");
                } else if (estadistikak[partidakont] < estadistikak[partidakont - 1]) {
                    System.out.println("\n-----Oraingoan okerrago egin duzu-----");
                }

            }
            partidakont++;
        }
        System.out.println("\nEskerrikasko jolasteagatik!!");
        // ESTADISTIKAK ARRAY-A ORDENATU
        Arrays.sort(estadistikak);
        // ESTATISTIKAK INPRIMATU
        System.out.println("-----ESTADISTIKAK-----");
        for (int i = 0; i < estadistikak.length; i++) {
            System.out.println((i + 1) + ". Postuan: " + estadistikak[2 - i] + " Puntu");
        }

    }

    /**
     * FOR HONETAN KONTROLATU EA ELEMENTUA AURREKO EEMENTUA 0 DEN,
     * LEHENENGO ALDIAN BETI BALORE RANDOM BAT EMAN, I-1 0 BADA HORRELA UTZI
     * 
     * @param partida
     * @return
     */
    static int[] Partidajolastu(int[] partida) {
        for (int i = 0; i < partida.length; i++) {
            partida[i] = (int) (Math.random() * 4);
            if (i != 0 && partida[i - 1] == 0) {
                partida[i] = 0;
            }
        }
        return partida;
    }

    /**
     * PARTIDA BAKOITZEAN LORTUTAKO PUNTUAK BATU
     * 
     * @param partida
     * @return
     */
    static int Estatistikalkulatu(int[] partida) {
        int estatistika = 0;
        for (int i = 0; i < partida.length; i++) {
            estatistika = estatistika + partida[i];
        }
        return estatistika;
    }
}
