package zzEntregarriak;

import java.util.ArrayList;
import java.util.Scanner;

public class Kudeaketa_Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> zereginak = new ArrayList<>();
        ArrayList<Boolean> egoerak = new ArrayList<>();
        // segi-k kontrolatuko du ea programa amaitu den ala ez
        int segi = 0;
        System.out.println("Ongi etorri ZEREGIN KUDEAKETA SISTEMARA");
        while (segi == 0) {
            System.out.println("Zer egin nahi duzu? (sartu zenbakia)");
            System.out.println(" [1] Zeregin berriak gehitu");
            System.out.println(" [2] Zeregin guztiak erakutsi");
            System.out.println(" [3] Zeregin bat amaitutzat markatu");
            System.out.println(" [4] Zeregin bat bilatu");
            System.out.println(" [5] Zeregin bat ezabatu");
            System.out.println(" [6] Estatistikak erakutsi");
            System.out.println(" [0] Irten");
            Integer aukeramenua = konprobatu(sc, 6, 0);
            switch (aukeramenua) {
                // programa amaitzeko funtzioa
                case 0:
                    System.out.println("Eskerrikasko erabiltzeagatik");
                    segi = 1;
                    break;
                // zeregin berria sartu
                case 1:
                    zereginBerriaSartu(zereginak, egoerak, sc);
                    break;
                // zeregin guztiak erakutsi
                case 2:
                    zereginGuztakErakutsi(zereginak, egoerak, sc);
                    break;
                // zeregin bat amaitutzat markatu
                case 3:
                    zereginaAmaitutzatEman(zereginak, egoerak, sc);
                    break;
                // zeregin bat bilatu
                case 4:
                    zereginaBilatu(zereginak, egoerak, sc);
                    break;
                // zeregin bat ezabatu
                case 5:
                    System.out.println("Zer egin nahi duzu?(zenakia)\n [0] Irten\n [1] Zeregin guzitak ezabatu\n [2] Amaitutako zeregin guztiak ezabatu\n [3] Zuk nahi duzun zeregina ezabatu");
                    int zer=konprobatu(sc, 3, 0);
                    switch (zer) {
                        case 0:
                            System.out.println("Ez da ezer ezabatu");
                            break;
                        case 1:
                            // zeregin guztiak ezabatu
                            guztiaEzabatu(zereginak, egoerak, sc);
                        break;
                        case 2:
                            // soilik amaitutako zereginak ezabatu
                            amaituakEzabatu(zereginak, egoerak, sc);
                        break;
                        case 3:
                            // erabakitako zeregina ezabatu
                            zereginaEzabatu(zereginak, egoerak, sc);
                        break;
                    }
                    break;
                // estadistikak eraktsi
                case 6:
                    erakutsiEstatistikak(zereginak, egoerak);
                    break;
            }

        }
        sc.close();
    }

    /**
     * Konprobatuko du ea parametro bat beharrezko eremuan dagoen ala ez
     * 
     * @param zenb
     * @param limitea
     */
    public static void konprobatuZenb(Integer zenb, int limitea, int behelim) {
        if (zenb > limitea || zenb < behelim) {
            throw new IllegalArgumentException(
                    "Zenbakia limitez kanpo dago," + behelim + " eta " + limitea + " artean egon behar du.");
        }
    }

    /**
     * konprobatuko du ea inputa baliozkoa den en general eta zihurtatzen da
     * baliozko inputa jarri dela edo bestela funtzionalitatetik kanpo doa
     * 
     * @param sc
     * @return
     */
    public static Integer konprobatu(Scanner sc, int golim, int behelim) {
        int aukera2 = 0;
        Integer aukerafinal = 0;
        while (aukera2 == 0) {
            String aukera = sc.nextLine();
            // hemen konprobatzen du ea inputa zenbakia den
            try {
                Integer.parseInt(aukera);
                aukera2 = 1;
            } catch (NumberFormatException e) {
                System.err.println("Mesedez sartu zenbaki bat");
                aukera2 = 0;
            }
            // hemen konprobatzen du ea zenbakia beharrezko tartean dagoen
            try {
                konprobatuZenb(Integer.parseInt(aukera), golim, behelim);
                aukera2 = 1;
                aukerafinal = Integer.parseInt(aukera);
            } catch (IllegalArgumentException e) {
                System.err.println("Sartutako zenbakia " + behelim + " eta " + golim + " bitartean egon behar da");
                aukera2 = 0;
            }
        }
        return aukerafinal;
    }

    /**
     * zeregin berria sartu funtzionalitatea, aukera ematen du bat baino gehiago
     * sartzeko
     * 
     * @param zereginak
     * @param egoera
     * @param sc
     */
    public static void zereginBerriaSartu(ArrayList<String> zereginak, ArrayList<Boolean> egoera, Scanner sc) {
        int aukera = 0;
        String desc = "";
        while (aukera == 0) {
            System.out.println("Sartu zeregin berriaren deskribapena:");
            desc = sc.nextLine();
            // konprobatzen du ea sartutako zeregina hutsa dagoen ala ez
            if (desc.length() == 0) {
                System.out.println("Zeregina ezin da hutsik egon");
            }
            /*
             * ez badago hutsa konprobatzen du ea zeregin hori sartuta dagoen jada eta beste
             * bat sartzeko aukera ematen du
             */
            else if (bilatuZeregina(zereginak, egoera, desc) >= 0) {
                System.out.println(
                        "Zeregin hau sartuta dago jada, berri bat sartu nahi duzu? ezezkoan aukeratik aterako zara(B/E)");
                if (sc.nextLine().charAt(0) == 'E') {
                    aukera = 1;
                }
                /*
                 * kasu honetan zeregina ez da hutsa eta ez da errepikatzen beraz gehitzen du
                 * eta beste bat sartzeko aukera ematen du
                 */
            } else if (bilatuZeregina(zereginak, egoera, desc) < 0) {
                zereginak.add(desc);
                egoera.add(false);
                System.out.println("Zeregina gehitu da.");
                System.out.println("Zeregin berri bat sartu nahi duzu? (B/E) ezezkoan aukeratik aterako zara");
                if (sc.nextLine().charAt(0) == 'E') {
                    aukera = 1;
                }
            }
        }
    }

    /**
     * lista batean zeregina bilatu, bilatu badu posizioa itzuli, ez badu bilatu -1
     * itzuli
     * 
     * @param zereginak
     * @param egoera
     * @param hitza
     * @return
     */
    public static int bilatuZeregina(ArrayList<String> zereginak, ArrayList<Boolean> egoera, String hitza) {
        for (int i = 0; i < zereginak.size(); i++) {
            if (zereginak.get(i).equals(hitza)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * lista bat emanda lista horren zeregunak eta haien egoera erakusten du
     * 
     * @param zereginak
     * @param egoera
     */
    public static void zereginGuztakErakutsi(ArrayList<String> zereginak, ArrayList<Boolean> egoera, Scanner sc) {
        // konprobatzen du ea lista hutsa dagoen ala ez eta hutsa badago esaten dizu
        // lehengo zeregin bat sartu behar dezula
        if (zereginak.size() == 0) {
            System.out.println("Ez duzu zereginik oraindik, sartu zereginen bat");
        } else {
            for (int i = 0; i < 15; i++) {
                System.out.print("-");
            }
            // sartuta dauden zereginak imprimatzen ditu
            System.out.print(" ZURE ZEREGINAK ");
            for (int i = 0; i < 15; i++) {
                System.out.print("-");
            }
            System.out.print("\n");
            String izenburua = "  ZENBAKIA          DESKRIBAPENA           EGOERA ";
            System.out.println(izenburua);
            for (int i = 0; i < zereginak.size(); i++) {
                for (int j = 0; j < 52; j++) {
                    if (j == 4) {
                        System.out.print("[" + (i + 1) + "]");
                    } else if (j == 19) {
                        System.out.print(zereginak.get(i));
                    } else if (j == 35) {
                        if (egoera.get(i) == false) {
                            System.out.print("Amaitu gabe");
                        } else {
                            System.out.print("Amaitua");
                        }

                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
            zereginakOrdenatu(zereginak, egoera, sc);
        }
    }
    /**
     * Zeregin lista alfabetikoki ordenatzen du
     * @param zereginak
     * @param egoera
     * @param sc
     */
    public static void zereginakOrdenatu(ArrayList<String> zereginak, ArrayList<Boolean> egoera, Scanner sc){
        System.out.println("Zereginak alfabetikoki ordenatu nahi dituzu?(B/E)");
            if(sc.nextLine().charAt(0)=='B'){
                String[] zereginpos = new String[zereginak.size()];
                boolean[] egoerapos = new boolean[egoera.size()];
                //sortu ditut bi array gordetzeko ordenean zereginen deskripzioa eta egoera 
                for(int i=0;i<zereginak.size();i++){
                    zereginpos[i]=zereginak.get(i);
                    egoerapos[i]=egoera.get(i);
                }
                //zereginak ordenatu ditut
                zereginak.sort(null);
                for(int i=0;i<zereginak.size();i++){
                    for(int j=0;j<egoera.size();j++){
                        /*zeregin listaren posizioak konprobatzen ditut eta koiniditzen badu aldatzen det egoera zerrenden
                        balioa balio berriarengatik*/
                        if(zereginak.get(i)==zereginpos[j]){
                            egoera.set(i, egoerapos[j]);
                        }
                    }
                }
                System.out.println("Zereginak alfabetikoki ordenatu dira");
            }else{
                System.out.println("Zereginak ez dira ordenatu");
            }
        }
    /**
     * Zeregin bat amaituta bezela esleitu
     * 
     * @param zereginak
     * @param egoera
     * @param sc
     */
    public static void zereginaAmaitutzatEman(ArrayList<String> zereginak, ArrayList<Boolean> egoera, Scanner sc) {
        // zeregin list ahutsa badago esaten dizu eta eskatzen dizu lehenik zeregin bat
        // sartzeko
        if (zereginak.size() == 0) {
            System.out.println("Ez duzu zereginik oraindikan, sartu zereginak mesedez");
        } else {
            // zereginak inprimatu
            System.out.println("Zeregin guztiak:");
            for (int i = 0; i < zereginak.size(); i++) {
                System.out.println(" [" + (i + 1) + "] " + zereginak.get(i));
            }
            System.out.println("Zein zeregin markatu nahi duzu?(zenbakia)");
            int aukera = konprobatu(sc, zereginak.size(), 0);
            // egoera amaitua baldin badago detektatu eta abisatzen dizu, gainera berriz
            // amaitu gabe egoerara aldatzen uzten dizu
            if (egoera.get(aukera - 1) == true) {
                System.out.println("Zeregin hau amaitu duzu ya, berriro amaitu gabe markatu nahi duzu?(B/E)");
                if (sc.nextLine().charAt(0) == 'B') {
                    egoera.set(aukera - 1, false);
                }
            } else {
                egoera.set(aukera - 1, true);
            }

        }

    }

    /**
     * zereginak bilatzeko baliabidea, ez badu aurkitzen beste bat bilatzeko aukera
     * eta
     * aurkitzen badu bere posizioa eta egoera erakutsi eta gainera beste bat bilatu
     * nahi dezun galdetu
     * 
     * @param zereginak
     * @param egoera
     * @param sc
     */
    public static void zereginaBilatu(ArrayList<String> zereginak, ArrayList<Boolean> egoera, Scanner sc) {
        int a = 0;
        // kontrolatu ea zerrenda hutsa dagoen ala ez
        if (zereginak.size() == 0) {
            System.out.println("Zerrenda hutsa dago, lehenik zeregin bat sartu mesedez");
        } else {
            while (a == 0) {
                System.out.println("Zein zeregin bilatu nahi dezu?");
                int i = bilatuZeregina(zereginak, egoera, sc.nextLine());
                // zeregina ez bada aurkitu hau exekutatu
                if (i < 0) {
                    System.out.println("Zeregina ez da aurkitu, beste bat bilatu nahi dezu?(B/E)");
                    if (sc.nextLine().charAt(0) == 'E') {
                        a = 1;
                    }
                    // zeregina aurkitu bada hau exekutatu
                } else {
                    System.out.print("Zure zeregina: [" + (i + 1) + "] " + zereginak.get(i));
                    if (egoera.get(i) == false) {
                        System.out.println("      Amaitu gabe.");
                    } else {
                        System.out.println("      Amaitua");
                    }
                    deskaldatu(zereginak, egoera, sc, i);
                    System.out.println("Beste zereginik bilatu nahi dituzu?(B/E)");
                    if (sc.nextLine().charAt(0) == 'E') {
                        a = 1;
                    }
                }
            }
        }

    }
    /**
     * Zeregin baten posizioa emanda deskribapena aldatzeko aukera ematen du
     * @param zereginak
     * @param egoera
     * @param sc
     * @param pos
     */
    public static void deskaldatu(ArrayList<String> zereginak, ArrayList<Boolean> egoera, Scanner sc, int pos){
        System.out.println("Zereginaren deskribapena aldatu nahi duzu?(B/E)");
        if(sc.nextLine().charAt(0)=='B'){
            System.out.println("Sartu deskribapen berria:");
            zereginak.set(pos, sc.nextLine());
            System.out.println("Zereginaren deskribapena aldatu da");
        }
    }
    /**
     * Erabakitzen duzun zeregina ezabatzen du
     * @param zereginak
     * @param egoera
     * @param sc
     */
    public static void zereginaEzabatu(ArrayList<String> zereginak, ArrayList<Boolean> egoera, Scanner sc) {
        // Kontrolatu ea zerrenda hutsa dagoen ala ez
        if (zereginak.size() == 0) {
            System.out.println("Zerrenda hutsa dago, lehenik zeregin bat sartu mesedez");
        } else {
            // Zereginak inprimatu
            for (int i = 0; i < zereginak.size(); i++) {
                System.out.println("[" + (i + 1) + "] " + zereginak.get(i));
            }
            System.out.println("Zerin zeregin ezabatu nahi duzu? (zenbakia)");
            // konprobatzen du ea inputa zenbakia den eta beharrezko tartean dagoen
            int aukera = konprobatu(sc, zereginak.size() + 1, 1);
            // galdetu ea seguru dagoen
            System.out.println("Seguru zaude zeregina ezabatu nahi duzula?(B/E)");
            if (sc.nextLine().charAt(0) == 'B') {
                // zeregina borratu
                zereginak.remove(aukera - 1);
                egoera.remove(aukera - 1);
                System.out.println("Zeregina ezabatu da.");
            } else {
                System.out.println("Zeregina ez da ezabatu.");
            }
        }

    }
    /**
     * zeregin guztiak ezabatzen ditu
     * @param zereginak
     * @param egoera
     * @param sc
     */
    public static void guztiaEzabatu(ArrayList<String> zereginak, ArrayList<Boolean> egoera, Scanner sc){
        //konprobatu ea zerrenda hutsa dagoen ala ez
        if(zereginak.size()==0){
            System.out.println("Ez duzu zereginik ezabatzeko");
        }else{
            System.out.println("Seguro zaude zeregin guztiak ezabatu nahi dituzula?(B/E)");
            //galdetu ea benetan ezabatu nahi duen
            if(sc.nextLine().charAt(0)=='B'){
                zereginak.clear();
                egoera.clear();
                System.out.println("Dena ezabatu da.");
            }else{
                System.out.println("Ez da ezer ezabatu");
            }
        }
    }
    /**
     * Amaitutako zeregin guztiak ezabatzen dira
     * @param zereginak
     * @param egoera
     * @param sc
     */
     public static void amaituakEzabatu(ArrayList<String> zereginak, ArrayList<Boolean> egoera, Scanner sc){
        //konprobatu ea zerrenda huts dagoen ala ez
        if(zereginak.size()==0){
            System.out.println("Ez duzu zereginik ezabatzeko");
        }else{
            System.out.println("Seguro zaude amaitutako zeregin guztiak ezabatu nahi dituzula?(B/E)");
            //galdetu era benetan ezabatu nahi duen
            if(sc.nextLine().charAt(0)=='B'){
               for(int i=0;i<egoera.size();i++){
                if(egoera.get(i)==true){
                    zereginak.remove(i);
                    egoera.remove(i);
                }
               }
                System.out.println("Amaitutako zeregin guztiak ezabatu dira.");
            }else{
                System.out.println("Ez da ezer ezabatu");
            }
        }
    }
    /**
     * Zure estadistikak erakusten ditu, zeregin kop, amaitutakoak, amaitu gabeak eta ehunekoa
     * @param zereginak
     * @param egoera
     */
    public static void erakutsiEstatistikak(ArrayList<String> zereginak, ArrayList<Boolean> egoera) {
        if (zereginak.size() == 0) {
            System.out.print("Ez duzu zereginik, estadistikak azaltzeko lehenik zereginak sartu mesedez");
        } else {
            System.out.println("--- ZURE ESTADISTIKAK ----------");
            System.out.println("Zeregin kopurua: " + zereginak.size());
            int zenbatekoa = 0;
            for (int i = 0; i < egoera.size(); i++) {
                if (egoera.get(i) == true) {
                    zenbatekoa++;
                }
            }
            System.out.println("Amaitutako zereginak: " + zenbatekoa);
            System.out.println("Amaitu gabeko zereginak: " + (egoera.size() - zenbatekoa));
            double ehunekoa = (zenbatekoa / zereginak.size()) * 100;
            System.out.println("Amaitutako ehunekoa: %" + ehunekoa);
        }

    }
}
