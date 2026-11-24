
public class Debug5 {
    //Debuggera erabili eta dauden akatsak zuzendu itzazu

    public static void main(String[] args) {

        int[] zenbakiak = {4, 7, 2, 9, 6};
        //kopia array-a ez da erabili behar, dena zenbakiak array-arekin egin daiteke.
        /* int[] kopia = new int[zenbakiak.length]; */

        int batura = 0;
        int maximoa = 0;
        int bilatutakoa = 5;
        int posizioa = -1;
        int bikoitiKopurua = 0;
        boolean aurkitua = false;
        //i=0n hasi behar da, bestela lehenengo posizioa ez da konprobatuko, eta i<zenbakiak.length izan behar da ez <=
        for (int i = 0; i < zenbakiak.length; i++) {
            //batura ezin da zenbakiak[i] izan zeren ez zan besteekin batuko batura=batura + zenbakiak[i] izan behar da
            batura = batura+ zenbakiak[i];
            //zeinu aldaketa, if zenbakiak[i]>maximoa izan behar da
            if (zenbakiak[i] > maximoa) {
                maximoa = zenbakiak[i];
            }

            if (zenbakiak[i] == bilatutakoa) {
                //zenbakia aurkitu bada, aurkitutakoa = true izan beharko da 
                aurkitua = true;
                posizioa = i + 1;
            }
            //hemen ez du zentzurik zenbakia>5 bada bikoiti bezela kontatzea, beraz soilik zenbakia%2==0.
            if (zenbakiak[i] % 2 == 0) {
                bikoitiKopurua++;
            }

          /* kopia[i] = zenbakiak[i]; */
        }
        // batura double-era bihurtu batazbestekoa ondo eman dadin, beheraka borobildu ez dezan
        double batezbestekoa = (double)batura / zenbakiak.length;

        System.out.println("Batura: " + batura);
        System.out.println("Batezbestekoa: " + batezbestekoa);
        System.out.println("Handiena: " + maximoa);

        if (aurkitua == true) {
            System.out.println(
                "Zenbakia " + posizioa + ". posizioan aurkitu da"
            );
        } else {
            System.out.println("Zenbakia ez da aurkitu");
        }

        System.out.println("Zenbaki bikoitien kopurua: " + bikoitiKopurua);
        System.out.println(" Array-a:");
        //ez det ulertzen zertarako den kopia array-a, gure array nagusiarekin egin daiteke
        for (int i = 0; i < zenbakiak.length; i++) {
            System.out.println(zenbakiak[i]);
        }
    }
}

