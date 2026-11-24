package Metodoak;
import java.util.Scanner;
public class Metodoak02 {
    public void main(String[]args){
        //ZENBAKIA <0,>0,=0
        Scanner sc=new Scanner(System.in);
        System.out.println("Sartu konprobatu nahi dezun zenbakia:");
        System.out.println("Zure zenbakia "+konprobatu(sc.nextInt())+" da.");
        sc.close();
    }
    static String konprobatu (int zenbakia){
        if(zenbakia==0){return"0";}
        else if(zenbakia>0){return "positiboa";}
        else {return "negatiboa";}
    }
}
