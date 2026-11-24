package Metodoak;
import java.util.Scanner;
public class Metodoak07 {
    //ARRAY BETEKO MAX ETA MIN
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zenbat=0;
        System.out.println("Zenbat zenbaki sartu nahi dituzu?");
        zenbat=sc.nextInt();
        int zenbakiak[] = new int[zenbat];
        for(int i=0;i<zenbat;i++){
            System.out.println("Sartu "+(i+1)+". zenbakia:");
            zenbakiak[i]=sc.nextInt();
        }
        System.out.println("Maximoa: "+maximoa(zenbakiak)+"\n Minimoa: "+minimoa(zenbakiak));
        sc.close();
    }
    static int maximoa(int[] zenbakiak){
        int max= zenbakiak[0];
        for(int i=1;i<zenbakiak.length;i++){
            if(zenbakiak[i]>zenbakiak[i-1]){
                max=zenbakiak[i];
            }
        }
        return max;
    }
    static int minimoa(int[] zenbakiak){
         int min= zenbakiak[0];
        for(int i=1;i<zenbakiak.length;i++){
            if(zenbakiak[i]<zenbakiak[i-1]){
                min=zenbakiak[i];
            }
        }
        return min;
    }
}
