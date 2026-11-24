package Salbuespenak;
import java.util.Scanner;

public class Salbuespenak0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        
        System.out.print("Sartu lehen zenbakia: ");
        int lehenZenbakia = scanner.nextInt();
        System.out.print("Sartu bigarren zenbakia: ");
        int bigarrenZenbakia = scanner.nextInt();
        zatitu(lehenZenbakia, bigarrenZenbakia); 
        }
        catch(ArithmeticException e){
            System.err.println("Errorea: "+e.getMessage());
        }  
        finally{
        scanner.close();
        }
    }

    private static void zatitu(int a, int b) {  
        System.out.println("Zatiketaren emaitza: " + a/b);
    }
}
