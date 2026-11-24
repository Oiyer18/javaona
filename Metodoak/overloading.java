package Metodoak;
import java.util.Scanner;
public class overloading {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=2, b=4;
       System.out.println(azalera(a));
        System.out.println(azalera(a, b));
        agurtu("Oier");
        agurtu("Oier", 22);
        sc.close();
    }
    static double azalera(int a){
       int azalera=a*a;
        return azalera;
    }
    static double azalera(int a, int b){
        return a*b;
    }
     static void agurtu(String a){
       System.out.println("Kaixo, "+a);
        
    }  static void agurtu(String a, int b){
       System.out.println("Kaixo, "+a+" "+b+" urte dituzu");
        
    }   
}
