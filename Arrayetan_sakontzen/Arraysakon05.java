package Arrayetan_sakontzen;
import java.util.Scanner;
public class Arraysakon05 {
    //MATRIZE SIMETRIKOA
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int matrizea[][]=new int[4][4];
        for(int i=0;i<matrizea.length;i++){
            for(int j=0;j<matrizea[i].length;j++){
                System.out.println("sartu ("+(i+1)+","+(j+1)+") garren zenbakia mesedez");
                matrizea[i][j]=sc.nextInt();
            }
        }
        int kont=0;
        for(int[]errenkada:matrizea){
            for(int zenb:errenkada){
                System.out.print(" "+zenb+" ");
                kont++;
                if(kont%4==0){
                    System.out.print("\n");
                }
            }
        }
        kont=0;
        for(int i=0;i<matrizea.length;i++){
            for(int j=0;j<matrizea[0].length;j++){
                if(matrizea[i][j]!=matrizea[j][i]){
                    kont++;
                }
            }
        }     
        if(kont>0){
            System.out.println("Ez da simetrikoa");
        }else{
            System.out.println("Simetrikoa da!!");
        }
        sc.close();
    }
}
