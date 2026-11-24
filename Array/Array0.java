package Array;

public class Array0 {
    public void main(String[]args){
        int[]array=new int[9];
        int i, batura=0;
        for(i=0;i<9;i++){
            array[i]=(int)(Math.random()*10) +1;
            System.out.println(array[i]);
            batura= batura + array[i];
        }
        System.out.println(batura);
    }
}
