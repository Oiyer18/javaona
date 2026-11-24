package String;

import java.util.Scanner;

public class String06 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        System.out.println("Sartu izena: ");
        text = sc.nextLine();
        System.out.println(text.replace(' ', '_'));
        sc.close();
    }
}
