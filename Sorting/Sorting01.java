package Sorting;

public class Sorting01 {
    public static void main(String[]args){
    int array[] = new int[15];
    for(int i=0;i<array.length;i++){
        array[i]=(int)(Math.random()*10);
        System.out.print(" "+array[i]);
    }
    for(int i=0;i<array.length;i++){
        for(int j=0;j<array.length-1-i;j++){
            if(i!=array.length-1){
            if(array[j]<array[j+1]){
                int k=array[j];
                array[j]=array[j+1];
                array[j+1]=k;
            }
        }
        }
    }
    System.out.print("\n");
    for(int i=0;i<array.length;i++){
        
        System.out.print(" "+array[i]);
    }

    }
}
