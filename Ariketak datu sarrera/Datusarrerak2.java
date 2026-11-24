import java.util.Scanner;
public class Datusarrerak2 {
    public static void main(String[]args){
     Scanner sc= new Scanner(System.in);
        int zenbakia;
        System.out.println("Sartu zenbaki bat mesedez");
        zenbakia= sc.nextInt();
        System.out.println("Sartu dezun zenbakia "+zenbakia+" da, bere bikoitza "+2*zenbakia+" da eta bere hirukoitza "+3*zenbakia+" da.");
        sc.close();
    }
}
