import java.util.Scanner;

public class for01 {
    public void main(String[] args) {
        // bost * agertzea pantailan
        Scanner sc = new Scanner(System.in);
        int a, i;
        System.out.println("Sartu zenbat izar erakutsi nahi dituzun:");
        a = sc.nextInt();
        for (i = 1; i <= a; i++) {
            System.out.print("*");
        }
        sc.close();
    }
}
