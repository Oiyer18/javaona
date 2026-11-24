import java.util.Scanner;

public class Ariketana14 {
    // EZ BUKATUA
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n;
        System.out.println("Sartu zenbaki bat:");
        n = sc.nextInt();
        for (i = 1; i < (n * n) + 1; i++) {
            System.out.print("* ");
            if (n % i == 0 && i != 1) {
                System.out.print("\n");
            }
        }
        sc.close();
    }
}