package Arrayetan_sakontzen;
//PUNTETAN 1 ETA BESTELA 0 8X6 MATRIZE
public class Arraysakon09 {
public static void main(String[]args){
        int matrizea[][]=new int[8][6];
        for(int i=0;i<matrizea.length;i++){
            for(int j=0;j<matrizea[i].length;j++){
                if((j==0||j==matrizea[i].length-1)&&(i==0||i==matrizea.length-1)){
                 matrizea[i][j]=1;
                }
            }
        }
        int kont=0;
        for(int i=0;i<matrizea.length;i++){
            for(int j=0;j<matrizea[i].length;j++){
                System.out.print(" "+matrizea[i][j]+" ");
                kont++;
                if(kont%6==0){
                    System.out.print("\n");
                }
            }
        }

    }    
}
