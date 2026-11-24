package Metodoak;
import java.util.Scanner;
public class Metodoak01 {
    public static void main(String[]args){
        //TENPERATURA BIHURTU   
        Scanner sc=new Scanner(System.in);
        System.out.println("Sartu zure tenperatura ºC-etan mesedez:");
        System.out.println("Zure tenperatura "+farenheit(sc.nextDouble())+"F da.");
        sc.close();
    }
    static Double farenheit(Double celsius){
        return (celsius*9/5)+32;
    }
}
