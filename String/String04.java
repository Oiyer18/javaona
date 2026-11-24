package String;

import java.util.Scanner;

public class String04 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1, text2;
        System.out.println("Sartu lehenengo karaktere katea:");
        text1 = sc.next();
        System.out.println("Sartu bigarren karaktere katea:");
        text2 = sc.next();
        System.out.println("Sartutako karaktere kateak elkarren segidan: " + (text1 + text2));
        sc.close();
    }
}
