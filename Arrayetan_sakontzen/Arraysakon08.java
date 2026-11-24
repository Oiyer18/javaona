package Arrayetan_sakontzen;
//1-AK BESTE DIAGONALEAN
public class Arraysakon08 {
 public static void main(String[]args){
        int matrizea[][]=new int[7][7];
        for(int i=0;i<matrizea.length;i++){
         matrizea[i][matrizea.length-1-i]=1;
        }
        int kont=0;
        for(int i=0;i<matrizea.length;i++){
            for(int j=0;j<matrizea[i].length;j++){
                System.out.print(" "+matrizea[i][j]+" ");
                kont++;
                if(kont%7==0){
                    System.out.print("\n");
                }
            }
        }

    } 
}
