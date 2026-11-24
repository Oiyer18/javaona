package String;

import java.util.Scanner;

public class String01 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textua;
        System.out.println("Sartu textu bat:");
        textua = sc.next();
        System.out.println(textua + " " + textua.length() + " letra ditu.");
        System.out.println("7.posizioan dagoen karakterea: " + textua.charAt(6) + " da.");
        if ( textua.indexOf("x") < 0) {
            System.out.println(" 'x' Karakterea ez da aurkitu");
        } else {
            System.out.println("x karakterea textuaren " + textua.indexOf("x") + " posizioan dago.");
        }
        System.out.println("Sarutuako textua maiuskulaz: " + textua.toUpperCase());
        sc.close();
    }

}
