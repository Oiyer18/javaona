import java.util.Scanner;

public class Datusarrerak5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zenb1, zenb2, zenb3;
        double batezbest;
        System.out.println("Sartu lehenengo zenbakia:");
        zenb1 = sc.nextInt();
        System.out.println("Sartu bigarren zenbakia:");
        zenb2 = sc.nextInt();
        System.out.println("Sartu hirugarren zenbakia:");
        zenb3 = sc.nextInt();
        batezbest = (zenb1 * 0.3 + zenb2 * 0.2 + zenb3 * 0.5);
        System.out.println("Emandako zenbakien batazbestekoen balioa " + batezbest + " da.");

        sc.close();
    }
}
