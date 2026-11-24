package Metodoak;
import java.util.Scanner;
public class Metodoak09 {
    //ARRAY BAT ALDERANTZIZ ERAKUTSI
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int zenbat=0;
        System.out.println("Zenbat zenbaki sartu nahi dituzu?");
        zenbat=sc.nextInt();
        int zenbakiak[] = new int[zenbat];
        for(int i=0;i<zenbat;i++){
            System.out.println("Sartu "+(i+1)+". zenbakia:");
            zenbakiak[i]=sc.nextInt();
        }
        alrebes(zenbakiak);

        sc.close();
    }
    static void alrebes(int[] zenbakiak){
        for(int i=zenbakiak.length-1;i>-1;i--){
            System.out.print(" "+zenbakiak[i]);
        }
    }
}
