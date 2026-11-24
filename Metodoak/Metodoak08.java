package Metodoak;
import java.util.Scanner;
public class Metodoak08 {
    //ZENBAT ALDIZ AGERTZEN DEN BALIO BAT
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int zenbat=0;
        System.out.println("Zenbat zenbaki sartu nahi dituzu?");
        zenbat=sc.nextInt();
        int zenbakiak[] = new int[zenbat];
        for(int i=0;i<zenbat;i++){
            System.out.println("Sartu "+(i+1)+". zenbakia:");
            zenbakiak[i]=sc.nextInt();
        }
        System.out.println("Zein zenbaki kontatu nahi dezu?");
        System.out.println("Listan dagoen kopurua: "+kopurua(zenbakiak,sc.nextInt()));
        sc.close();
    }
    static int kopurua(int[] zerrenda, int zenb){
        int kont=0;
        for(int i=0;i<zerrenda.length;i++){
            if(zerrenda[i]==zenb){
                kont++;
            }
        }
        return kont;
    }
}
