package String;

import java.util.Scanner;

public class String08 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Esaldia;
        int hitzak = 0, kont = 0;
        System.out.println("Sartu esaldia mesedez: ");
        Esaldia = sc.nextLine();
        for (kont = 0; kont < Esaldia.length(); kont++) {
            // Esaldi guztiko karaktereetatik pasatzen da
            if (Esaldia.charAt(kont) == ' ') {
                hitzak++;
            }
        }
        // Lehenengo hitza baino lehen ez dago espaziorik beraz bat gehitzen diot
        hitzak++;
        System.out.println("Sartutako textuak " + hitzak + " hitz ditu.");
        sc.close();
    }
}
