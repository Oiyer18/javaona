package String;

import java.util.Scanner;

public class String07 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt, xtx = "";
        char a;
        System.out.println("Sartu hitza mesedez:");
        txt = sc.next();
        for (int i = (txt.length() - 1); i >= 0; i--) {
            a = txt.charAt(i);
            xtx = xtx + a;
        }
        /*
         * System.out.println(txt);
         * System.out.println(xtx);
         */
        if (txt.equals(xtx)) {
            System.out.println("Palindromoa da.");
        } else {
            System.out.println("Ez da palindromoa.");
        }
        sc.close();
    }
}
