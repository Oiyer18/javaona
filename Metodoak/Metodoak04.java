package Metodoak;
import java.util.Scanner;
public class Metodoak04 {
    //ZENBAKI LEHENA
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sartu zenbakia mesedez:");
        System.out.println(leehena(sc.nextInt()));
        sc.close();
    }
    static boolean leehena(int zenb){
        int kont=0;
        for(int i=2;i<zenb;i++){
            if(zenb%i==0){
                kont++;
            }
        }
        if(zenb==1){return false;}
        else if(kont==0){return true;}
        else{return false;}
    }
}
