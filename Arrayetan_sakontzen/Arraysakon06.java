package Arrayetan_sakontzen;

public class Arraysakon06 {
 public static void main(String[]args){
    int matrize1[][]= new int[3][3],matrize2[][]=new int[3][3], matrizebat[][]=new int[3][3];
    for(int i=0;i<matrize1.length;i++){
        for(int j=0;j<matrize2[i].length;j++){
            matrize1[i][j]=(int)(Math.random()*10);
            matrize2[i][j]=(int)(Math.random()*10);
        }
    }
    int kont=0;
    System.out.println("1. matrizea:");
    for(int i=0;i<matrize1.length;i++){
        for(int j=0;j<matrize2[i].length;j++){
           System.out.print(" "+matrize1[i][j]+" ");
           kont++;
           if(kont%3==0){
            System.out.print("\n");
           }
        }
    }
    System.out.println("2.matrizea:");
    kont=0;
    for(int i=0;i<matrize1.length;i++){
        for(int j=0;j<matrize2[i].length;j++){
           System.out.print(" "+matrize2[i][j]+" ");
           kont++;
           if(kont%3==0){
            System.out.print("\n");
           }
        }
    }
    for(int i=0;i<matrize1.length;i++){
        for(int j=0;j<matrize2[i].length;j++){
           matrizebat[i][j]=matrize1[i][j]+matrize2[i][j];
        }
    }
    System.out.println("Bien batura:");
    kont=0;
    for(int i=0;i<matrizebat.length;i++){
        for(int j=0;j<matrizebat[i].length;j++){
           System.out.print(" "+matrizebat[i][j]+" ");
           kont++;
           if(kont%3==0){
            System.out.print("\n");
           }
        }
    }
 }   
}
