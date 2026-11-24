package Arrayetan_sakontzen;
import java.util.Scanner;
public class Arraysakon03 {
    //POSIZIO BAT ATZERATU
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] zenb=new int[10];
        for(int i=0;i<zenb.length;i++){
            zenb[i]=(int)(Math.random()*(20))+1;
            System.out.print(" "+zenb[i]);
        }
        System.out.println("\n Ezkerreruntz array-a");
        int  k=zenb[0];
        for(int i=0;i<zenb.length;i++){
            if(i!=zenb.length-1){
                zenb[i]=zenb[i+1];
            }else{
                zenb[i]=k;
            }
            System.out.print(" "+zenb[i]);
        }    
        sc.close();
    }
}
