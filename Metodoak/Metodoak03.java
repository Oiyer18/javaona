package Metodoak;
import java.util.Scanner;
public class Metodoak03 {
    //FAKTORIALA
    public void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Sartu zenbakia:");
        System.out.println(faktoriala(sc.nextInt()));
        sc.close(); 
    }
    /**FAKTORIALA EGIN
     * 
     * @param zenb
     * @return
     */
    static int faktoriala(int zenb){
        int fakt=1;
        for(int i=1;i<zenb+1;i++){
         fakt=fakt*i;
        }
        zenb=zenb*fakt;
        if(zenb==0){return 1;}
        else{return fakt;}
    }
}
