import java.util.Scanner;

public class Datusarrerak4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zenb1, zenb2, zenb3, batezbest;
        System.out.println("Sartu 3 zenbaki batazbestekoa egiteko:");
        System.out.println("Santu lehenengo zenbakia:");
        zenb1 = sc.nextInt();
        System.out.println("Sartu bigarren zenbakia:");
        zenb2 = sc.nextInt();
        System.out.println("Santu hirugarren zenbakia:");
        zenb3 = sc.nextInt();
        batezbest = (zenb1 + zenb2 + zenb3) / 3;
        System.out.println("Zenbakien batazbestekoa " + batezbest + " da.");
        sc.close();
    }

}
