package String;

import java.util.Scanner;

public class String02 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luz, a = 0;
        String txt;
        char konta;
        System.out.println("Sartu textu bat eta esango dizut zenbat 'a' dauden bertan");
        txt = sc.next();
        luz = txt.length();
        for (int i = 0; i < luz; i++) {
            konta = txt.charAt(i);
            if (konta == 'a' || konta == 'A') {
                a++;
            }
        }
        System.out.println("'a' karaketera " + a + " aldiz agertzen da.");
        sc.close();
    }
}
