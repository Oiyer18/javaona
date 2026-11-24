package Arrayetan_sakontzen;
import java.util.Scanner;
public class Arraysakon01 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int zenbakiak[][]=new int[2][10];
        int nahasketa[]=new int[20];
        System.out.println("Sartu 10 zenbaki oso mesedez: ");
        for(int i=0;i<zenbakiak[0].length;i++){
           zenbakiak[0][i]=sc.nextInt();
        }
         System.out.println("Sartu 10 zenbaki gehiago mesedez: ");
        for(int i=0;i<zenbakiak[1].length;i++){
           zenbakiak[1][i]=sc.nextInt();
        }
        int kont=0,kont2=0;
        for(int i=0;i<nahasketa.length;i++){ 
          if(i%2==0){
              nahasketa[i]=zenbakiak[0][kont];
              kont++;
            }
           else{
             nahasketa[i]=zenbakiak[1][kont2];
             kont2++;
            }
        }
        for(int zenb:nahasketa){
            System.out.print(" "+zenb+" ");
        }
        sc.close();
    }
}
