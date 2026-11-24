package Arrayetan_sakontzen;
import java.util.Scanner;
public class Arraysakon04 {
    //m+n matrizea
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int matrizea[][]=new int[5][5];
        for(int i=0;i<matrizea.length;i++){
            for(int j=0;j<matrizea[i].length;j++){
                matrizea[i][j]= i + j;
            }
        }
        System.out.println("Bukaerako matrizea: ");
        int kont=0;
        for(int[]errenkada:matrizea){
            for(int zenb:errenkada){
                System.out.print(" "+zenb+" ");
                kont++;
                if(kont%5==0){
                    System.out.print("\n");
                }
            }
        }
        sc.close();
    }
}
