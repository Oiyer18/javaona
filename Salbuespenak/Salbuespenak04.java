package Salbuespenak;
import java.util.Scanner;
/*BANKUAREN ARIKETA */
public class Salbuespenak04 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zenbat saldo dezu?");
        double saldoa=Double.parseDouble(sc.nextLine());
        System.out.println("Zenbat diru atera nahi dezu?");
        double dirua=Double.parseDouble(sc.nextLine());
        try{saldoa=ateraDirua(saldoa,dirua);
             if(saldoa>=0){
            System.out.println("Saldo berria: "+saldoa);
        }
        }
        
        catch(IllegalArgumentException e){
            System.err.println("Errorea: "+e.getMessage());
        }
        
        finally{
       
         sc.close();}
    }
    public static Double ateraDirua(double saldo, double kopurua){
        double saldoberri=saldo-kopurua;
       if(saldoberri<0){
        throw new IllegalArgumentException("Ez duzu hainbeste dirurik");
       }
       return saldoberri;
       
    }
}
