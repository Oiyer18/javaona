package Metodoak;
import java.util.Scanner;
public class Metodoak06 {
    //ARRAY BATEN BATEZBEST
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int zenbat=0;
        
        System.out.println("Zenbat zenbakiko batazbestekoa sortu nahi dezu?");
        zenbat=sc.nextInt();
        int zenbakiak[] = new int[zenbat];
        for(int i=0;i<zenbat;i++){
            System.out.println("Sartu "+(i+1)+". zenbakia:");
            zenbakiak[i]=sc.nextInt();
        }
        if(zenbakiak.length!=0){
        System.out.println("Batazbestekoa: "+batezbest(zenbakiak));
        }
        else{
            System.out.println("Array-a hutsa dago.");
        }
        sc.close();
    }
    static int batezbest(int[] zenbakiak){
        int kont=0;
        if(zenbakiak.length!=0){
        for(int i=0;i<zenbakiak.length;i++){
            kont=kont+zenbakiak[i];
        }
        return kont/zenbakiak.length;
        }
        else{
            return 0;
        }
    }
}
