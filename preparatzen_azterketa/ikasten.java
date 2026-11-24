package preparatzen_azterketa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ikasten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ALDAGIAK DEFINITZEKO

        int txandakopuru = 3, egunkopuru = 3;
        int[][] kontsultak = new int[egunkopuru][txandakopuru];
        int[] txandalibre = new int[egunkopuru];
        ArrayList<Integer> pertsonakode = new ArrayList<>();
        ArrayList<String> pertsonaizen = new ArrayList<>();

        // PROGRAMA HEMEN

        kontsultak = txandakHasieratu(kontsultak, txandakopuru, egunkopuru).clone();
        inprimituTxandak(kontsultak, egunkopuru);
        txandalibre = txandaLibreak(kontsultak, egunkopuru, txandakopuru).clone();
        egunBeteak(txandalibre);
        // 1.txanda bete
        txandaBerria(kontsultak, pertsonaizen, pertsonakode, sc);
        inprimituTxandak(kontsultak, egunkopuru);
        // 2.txanda bete
        txandaBerria(kontsultak, pertsonaizen, pertsonakode, sc);
        inprimituTxandak(kontsultak, egunkopuru);
        // 3.txanda bete
        txandaBerria(kontsultak, pertsonaizen, pertsonakode, sc);
        inprimituTxandak(kontsultak, egunkopuru);
        // erreserba aurkitu
        erreserbaAurkitu(sc, pertsonaizen, pertsonakode, kontsultak);
        //erreserba kopurua esan
        erreserbaKopurua(kontsultak);
        sc.close();
    }

    /**
     * KONTSULTAK HASIERATZEN DITU
     * 
     * @param kontsultak
     * @param egunakop
     * @param kontsultakop
     * @return
     */
    public static int[][] txandakHasieratu(int kontsultak[][], int egunakop, int kontsultakop) {
        // errenkada eta zutabe guztietatik pasako da azken kontsulta kenduta beti libre
        // egon behar delako
        for (int i = 0; i < egunakop; i++) {
            for (int j = 0; j < kontsultakop - 1; j++) {
                // ausaz erabaki kontsulta libre egongo dan edo ez
                int ausa = (int) (Math.random() * 2);
                if (ausa != 0) {
                    // ausa=0 bada kontsultari 10-99 zenbaki random-a esleitu
                    kontsultak[i][j] = (int) (Math.random() * (99 - 10 + 1)) + 10;
                }

            }
        }
        return kontsultak;
    }

    /**
     * EGUN GUZTIETAN DAUDEN TXANDEN EGOERA INPRIMATU
     * 
     * @param kontsultak
     * @param egunkop
     */
    public static void inprimituTxandak(int kontsultak[][], int egunkop) {
        for (int i = 0; i < egunkop; i++) {
            System.out.println((i + 1) + ".eguna " + Arrays.toString(kontsultak[i]));
        }
    }

    /**
     * EGUN ETA KONTSULTA GUZTIETATIK PASA ETA KONTATU ZEINTZUK DAUDEN LIBRE
     * 
     * @param kontsultak
     * @param egunkop
     * @param txandakop
     * @return
     */
    public static int[] txandaLibreak(int kontsultak[][], int egunkop, int txandakop) {
        int[] txandalibre = new int[egunkop];
        for (int i = 0; i < egunkop; i++) {
            for (int j = 0; j < txandakop; j++) {
                if (kontsultak[i][j] == 0) {
                    txandalibre[i]++;
                }
            }
        }
        return txandalibre;
    }

    /**
     * INPRIMATZEN DITU EGUN BAKOITZEAN ZENBAT TXANDA LIBRE DAUDEN
     * 
     * @param txandalibreak
     */
    public static void egunBeteak(int txandalibreak[]) {
        int konttxandalibre = 0;
        for (int i = 0; i < txandalibreak.length; i++) {
            if (txandalibreak[i] != 0) {
                System.out.println((i + 1) + ". egunean: " + txandalibreak[i] + " txanda libre daude");
                konttxandalibre++;
            }
        }
        if (konttxandalibre == txandalibreak.length) {
            System.out.println("Egun guztietan txanda libreak daude!!");
        }
    }

    /**
     * TXANDA BERRI BAT EGITEKO AUKERA EMAN, KONTROLATU EA EGUN HORRETAN TXANDA
     * GUZTIAK HARTUTA DAUDEN ALA EZ
     * 
     * @param kontsultak
     * @param pazienteak
     * @param pertsonakode
     * @param sc
     */
    public static void txandaBerria(int kontsultak[][], ArrayList<String> pazienteak, ArrayList<Integer> pertsonakode,
            Scanner sc) {
        int benekode = 0;
        String izena = " ", txanda = " ", kodea = " ";
        int konprobante = 1;

        System.out.println("Pazientearen izena:");
        while (konprobante == 1) {
            izena = sc.nextLine();
            try {
                ezHutsa(izena);
                konprobante = 0;
            } catch (IllegalArgumentException e) {
                konprobante = 1;
                System.out.println("Sartu pazientearen izena ondo mesedez:");
            }
        }
        konprobante = 1;

        System.out.println("Pazientearen kodea:");
        while (konprobante == 1) {
            kodea = sc.nextLine();
            try {
                Integer.parseInt(kodea);
            } catch (NumberFormatException e) {
                System.out.println("Faborez sartu zenbaki bat");
                konprobante = 1;
            }
            try {
                tarteanDago(kodea, 99, 10);
                konprobante = 0;
            } catch (IllegalArgumentException e) {
                System.out.println("Zenbakia 99 eta 10 artean egon behar da!");
                konprobante = 1;
            }
        }
        benekode = Integer.parseInt(kodea);

        konprobante = 1;

        System.out.println("Zein egunean hartu nahi duzu txanda?");
        while (konprobante == 1) {
            txanda = sc.nextLine();
            try {
                Integer.parseInt(txanda);
            } catch (NumberFormatException e) {
                System.out.println("Faborez sartu zenbaki bat");
                konprobante = 1;
            }
            try {
                tarteanDago(txanda, kontsultak.length, 1);
                konprobante = 0;
            } catch (IllegalArgumentException e) {
                System.out.println("Sartutako balioa ez dago tartearen barruan!");
                konprobante = 1;
            }
        }

        int kontagailu = 0;
        for (int i = 0; i < kontsultak[Integer.parseInt(txanda)].length; i++) {
            if (kontsultak[Integer.parseInt(txanda) - 1][i] == 0) {
                kontsultak[Integer.parseInt(txanda) - 1][i] = benekode;
            } else {
                kontagailu++;
            }
        }
        if (kontagailu == kontsultak[Integer.parseInt(txanda)].length) {
            System.out.println("Egun horretan ez zeuden kontsulta librerik gelditzen berez ez da egin");
        } else {
            pazienteak.add(izena);
            pertsonakode.add(benekode);
        }

    }
    /**
     * ORAIN ARTE DAUZKAGUN DATUEKIN LORTZEN ESATEN DU KODE BATEK ERRESERBAK EGIN DITUEN ALA EZ ETA ZER ERRESERBA
     * @param sc
     * @param izena
     * @param kodeak
     * @param kontsultak
     */
    public static void erreserbaAurkitu(Scanner sc,ArrayList<String> izena, ArrayList<Integer> kodeak, int kontsultak[][]) {
        String kodea = " ";
        int konprobantea = 1, benekode=0;
        System.out.println("Sartu kodea mesedez:");
        while (konprobantea == 1) {
            kodea=sc.nextLine();
            try {
                Integer.parseInt(kodea);
                konprobantea=0;
            } catch (NumberFormatException e) {
                System.out.println("Sartu zenbaki bat mesedez");
                konprobantea=1;
            }
        }
        benekode=Integer.parseInt(kodea);
        if(kodeak.contains(benekode)==true){
            System.out.println("Sartutako kodea "+izena.get(kodeak.indexOf(benekode))+" da");
            for(int i=0;i<kontsultak.length;i++){
                for(int j=0;j<kontsultak[i].length;j++){
                    if(kontsultak[i][j]==benekode){
                        System.out.println((i+1)+". egunean "+(j+1)+". kontsulta hartu du");

                    }
                }
            }
        }else{
            System.out.println("Sartutako kodea ez du kontsultarik egin");
        }
    }
    /**
     *EXISTITZEN DIREN ERRESERBA GUZTIAK KONTATU
     * @param kontsultak
     */
    public static void erreserbaKopurua(int kontsultak[][]){
        int kontagailu=0;
        for(int i=0;i<kontsultak.length;i++){
            for(int j=0;j<kontsultak[i].length;j++){
                if(kontsultak[i][j]!=0){
                    kontagailu++;
                }
            }
        }
        System.out.println("Guztira "+kontagailu+" kontsulta erregistratuta daude");
    }
    /**
     * SARTUTAKO IZENA HUTS DAGOEN EDO EZ KONPROBATU
     * 
     * @param izena
     * @return
     */
    public static void ezHutsa(String izena) {
        int kont = 0;
        for (int i = 0; i < izena.length(); i++) {
            if (izena.charAt(i) == ' ') {
                kont++;
            }
        }
        if (kont == izena.length()) {
            throw new IllegalArgumentException("Ezin duzu izena hutsa utzi");
        }
    }

    /**
     * SARTU DENA TARTE BATEN BARRUAN DAGOELA KONPROBATU
     * 
     * @param zenbakia
     * @param maximo
     * @param minimo
     * @return
     */
    public static void tarteanDago(String zenbakia, int maximo, int minimo) {
        if (Integer.parseInt(zenbakia) < minimo || Integer.parseInt(zenbakia) > maximo) {
            throw new IllegalArgumentException("Zenbakia tartean egon behar da");
        }
    }

}
