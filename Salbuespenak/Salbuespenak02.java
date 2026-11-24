package Salbuespenak;
import java.util.Scanner;
//ADINA EZIN DA NEGATIBOA IZAN
public class Salbuespenak02 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Sartu adina: ");
            int zenb=Integer.parseInt(sc.nextLine());
        try{
            
            if(zenb<0){
                throw new IllegalArgumentException("Adina ezin da negatiboa izan");
            }
            System.out.println("Adina onartua");
        } catch(IllegalArgumentException e){
            System.out.println("Errorea: "+e.getMessage());
        } 

        finally{sc.close();}
        
    }
}
