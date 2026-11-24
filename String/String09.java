package String;

import java.util.Scanner;

public class String09 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1, text2;
        System.out.println("Sartu lehenengo karaktere katea:");
        text1 = sc.next();
        System.out.println("Sartu bigarren karaktere katea:");
        text2 = sc.next();
        if (text1.equals(text2)) {
            // bi textuak berdinak diren kasua
            System.out.println("Berdinak dira!!");
        } else {
            if (text1.compareTo(text2) < 0) {
                // text2<text1
                System.out.println(text2 + " Alfabetikoki txikiagoa da " + text1 + " baino.");
            } else {
                // text2>text1
                System.out.println(text2 + " Alfabetikoki handiagoa da " + text1 + " baino.");
            }
        }
        sc.close();
    }
}
