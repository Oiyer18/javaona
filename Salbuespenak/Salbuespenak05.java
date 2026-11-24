package Salbuespenak;
import java.util.Scanner;
//Pasahitzaren baliozkotzea
public class Salbuespenak05 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Sartu pasahitza eta baliozkoa den edo ez esango da, Pasahitzak gutxienez 8 karaktere izan behar ditu eta ezin ditu espaziorik euki: ");
        try{
            egiaztatuPasahitza(sc.nextLine());
        }catch(IllegalArgumentException e){
            System.err.println("Errorea: "+e.getMessage());
        }
        sc.close();
    }
    static void egiaztatuPasahitza(String pasahitza){
        int a=0;
        if(pasahitza.length()<8){
            a=1;
            throw new IllegalArgumentException("Pasahitzak gutxienez 8 karaktere izan behar ditu");
        }
         for(int i=0;i<pasahitza.length();i++){
              if(pasahitza.charAt(i)==' '){
                a=1;
                i=pasahitza.length();
                throw new IllegalArgumentException("Pasahitzak ezin ditu espazioak eduki.");
            }
         }
         if(a==0){
            System.out.println("Ongi.");
         }
    }
}
