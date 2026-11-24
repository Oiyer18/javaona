package Arrayetan_sakontzen;

public class Arraysakon07 {
    //7x7 diagonal 1
    public static void main(String[]args){
        int matrizea[][]=new int[7][7];
        for(int i=0;i<matrizea.length;i++){
         matrizea[i][i]=1;
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
