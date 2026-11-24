import java.util.Scanner;
public class Ariketabaldintzak02 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.println("Sartu zenbaki bat mezedez:");
        a=sc.nextInt();
        if(a==0){
            System.out.println("Sartutako zenbakia 0 da.");
        }
        else{
            if(a%2==0){
                System.out.println(a+" zenbakia bikoitia da");
            }
            else{
                System.out.println(a+" zenabkia bakoitia da.");
            }
        }
        sc.close();
    }

    
}
