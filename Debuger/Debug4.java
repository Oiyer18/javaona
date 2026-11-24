import java.util.Scanner;

public class Debug4 {
// Debuggera erabili eta zuzendu ikusten dituzun akatsak.
    public static void main(String[] args) {

        Scanner tekla = new Scanner(System.in);

        int[] zenbakiak = {4, 8, 2, 9, 5};
        int bilatu = 0;
        int posizioa = -1;
        //i=0 bezela definitu behar da, bestela lehenengo posizioa ez da konprobatzen
        int i = 0; 

        System.out.print("Sartu bilatu nahi duzun zenbakia: ");
        bilatu = tekla.nextInt();
        //i<zenbakiak.lenght izan behar da, i<zenbakiak.length-1 zeren bestela ez zan azkeneko posizioa konprobatuko
        while (i < zenbakiak.length&& posizioa == -1) {

            if (zenbakiak[i] == bilatu) {
               
                posizioa = i + 1;
            }

            i++;
        }
        //posizioa>0 izan behar da ez posizioa!=0 
        if (posizioa > 0) {
            System.out.println(
                "Zenbakia aurkitu da. Posizioa: " + posizioa
            );
        } else {
            System.out.println("Zenbakia ez dago arrayan.");
        }

        tekla.close();
    }
}
