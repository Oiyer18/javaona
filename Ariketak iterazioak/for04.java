import java.util.Scanner;

public class for04 {
    public void main(String[] args) {
        // Sartutako 5 zenbakietatik esan zein den handiena
        Scanner sc = new Scanner(System.in);
        int hand = 0, i;
        System.out.println("Sartu 5 zenbaki:");
        for (i = 1; i < 6; i++) {
            int n1;
            System.out.println("Sartu " + i + " zenbakia.");
            n1 = sc.nextInt();
            if (n1 > hand) {
                hand = n1;
            }
        }
        System.out.println("Sartutako zenbaki handiena " + hand + " izan da.");
        sc.close();
    }

}
