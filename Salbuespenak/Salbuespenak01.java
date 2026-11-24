package Salbuespenak;
import java.util.Scanner;
//ZATIKETA EZ NEGATIBO
public class Salbuespenak01 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        try{
        int zenb = sc.nextInt();
        if(zenb<0){
            throw new IllegalArgumentException("Zenbakia positiboa izan behar da");
        }
        System.out.println("("+zenb+") Ongi\n");
        }catch(IllegalArgumentException e){
            System.err.println("Errorea: "+e.getMessage());
        }
        finally{
        sc.close();
        }
    }

}
