package Array;

import java.util.Scanner;

public class Array01 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notak[] = new int[9];
        int handiena = 0, gaindituak = 0;
        for (int i = 0; i < 9; i++) {
            System.out.println("Sartu " + (i + 1) + " nota mesedez.");
            notak[i] = sc.nextInt();
            if (i == 0) {
                handiena = notak[i];
            }
            if (i > 0 && notak[i] > notak[i - 1] ) {
                handiena = notak[i];
            }
            if (notak[i] > 4) {
                gaindituak++;
            }

        }
        System.out.println("Sartutako notetatik gaindituen kopurua: " + gaindituak + " da, eta nota altuena: "
                + handiena + " izan da.");
        sc.close();
    }
}
