import java.util.Scanner;

public class dowhile {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i;
        do {
            System.out.println("Sartu zenabik positibo bat: ");
            i = sc.nextDouble();
            if (i <= 0) {
                System.out.println("Zenbaki negatiboa edo 0!!");
            } else {
                System.out.println("Zenbaki positiboa!!");
            }
        } while (i <= 0);

        sc.close();
    }
}
