package Metodoak;
import java.util.Scanner;
public class Metodoak05 {
    //BOKALAK KONTATU
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sartu textua eta bokalak kontatuko dira");
        System.out.println("Bokalak: "+bokalakontatu(sc.nextLine()));
        sc.close();
    }
    static int bokalakontatu(String txt){
        int kont=0;
        txt=txt.toUpperCase();
        for(int i=0; i<txt.length();i++){
            if(txt.charAt(i)=='A'||txt.charAt(i)=='E'||txt.charAt(i)=='I'||txt.charAt(i)=='O'||txt.charAt(i)=='U'){
                kont++;
            }
        }
        return kont;
    }
}
