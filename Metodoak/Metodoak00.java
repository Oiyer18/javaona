package Metodoak;

import java.util.Scanner;

public class Metodoak00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sartu izena:");
        kaixoesan(sc.next());
        sc.close();
    }

    static void kaixoesan(String izena) {
        System.out.println("Kaixo " + izena + "! Ongi etorri. ");
    }
}
