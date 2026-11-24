package String;

import java.util.Scanner;

public class String10 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String SIGLAK, siglak;
        System.out.println("Sartu siglak jakin nahi duzun textua:");
        SIGLAK = sc.nextLine();
        siglak = SIGLAK.toLowerCase();
        // gure textua dena minuskulara pasa
        for (int i = 0; i < SIGLAK.length(); i++) {
            if (SIGLAK.charAt(i) != siglak.charAt(i)) {
                System.out.print(SIGLAK.charAt(i));
            }
        }
        sc.close();
    }

}
