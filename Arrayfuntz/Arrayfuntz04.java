package Arrayfuntz;
import java.util.Scanner;
public class Arrayfuntz04 {
    //ARRAY BAT ALDERANTZIZ
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int luzeera=0, BalMax=0, BalMin=0;
        System.out.println("Zer luzerakoa nahi dezu array-a?");
        luzeera=sc.nextInt();
        int datuak[]=new int[luzeera];
        int tuak[]=new int[luzeera];
        System.out.println("Balore maximoa?");
        BalMax=sc.nextInt();
        System.out.println("Balore minimoa?");
        BalMin=sc.nextInt();
    
        datuak= datuaKargatu(luzeera, BalMax, BalMin); 
        arrayerakutsi(datuak);
        System.out.print("\n");
        tuak= arrayAlderantziz(datuak); 
        arrayerakutsi(tuak);

        sc.close();
    }
    /** 
     * a luzeerako array bat sortu eta BalMax eta BalMin arteko ausazko baloreekin bete
     * @param a
     * @param BalMax
     * @param BalMin
     * @return
     */
    static int[] datuaKargatu(int a, int BalMax, int BalMin){
        int[]datuak= new int[a];
        for(int i=0;i<datuak.length;i++){
            datuak[i]=(int)(Math.random()*(BalMax-BalMin+1))+BalMin;
        }
        return datuak;
    }
    /**
     * Array-a alderanztu
     * @param datuak
     * @return
     */ 
    static int[] arrayAlderantziz(int[] datuak){
        for(int i=0;i<datuak.length/2;i++){
            int k=datuak[i];
            datuak[i]=datuak[datuak.length-1-i];
            datuak[datuak.length-1-i]=k;
        }
        return datuak;
    }
    /**
     * array-a printeatu
     * @param datuak
     */
    static void arrayerakutsi(int[] datuak){
        for(int i=0;i<datuak.length;i++){
            System.out.print(" "+datuak[i]);
        }
    }
}
