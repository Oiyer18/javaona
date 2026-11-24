package Arrayetan_sakontzen;
import java.util.Scanner;
public class Arraysakon02 {
    //MARTRIEZ BAT SIMETRIKOA ALA EZ
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int matrizea[][]=new int[4][4];
        for(int i=0;i<matrizea.length;i++){
            for(int j=0;j<matrizea[i].length;j++){
                System.out.println("sartu ("+(i+1)+","+(j+1)+") garren zenbakia mesedez");
                matrizea[i][j]=sc.nextInt();
            }
        }
        System.out.println("Zure matrizea:");
        int kont=0;
        for(int[] errenkada:matrizea){
            for(int zenbakia:errenkada){
                System.out.print(" "+zenbakia); 
                kont++;           
                if(kont%4==0){
                    System.out.print("\n");
                }    
            }
        }
        int kont2=0;
        for(int i=0;i<matrizea.length;i++){
            for(int j=0;j<matrizea[i].length;j++){
                if(matrizea[i][j]!=matrizea[j][i]){
                    kont2++;
                }
            }
            
        }
        if(kont2==0){
            System.out.println("Simetrikoa da!!");
        }else{
            System.out.println("Ez da simetrikoa!!");
        }

        sc.close();
    }
}
