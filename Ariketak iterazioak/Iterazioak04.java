import java.util.Scanner;

public class Iterazioak04 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1, i, k = 0;
        while (n < 11) {
            System.out.println("Sartu " + n + " zenabkia.");
            i = sc.nextInt();
            if (i > 0) {
                k++;
            }
            n++;
        }
        System.out.println("Zenbaki positiboen kopurua: " + k + " da.");
        sc.close();
    }
}
