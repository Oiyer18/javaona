package Salbuespenak;
import java.util.Scanner;
//NOTA AKOTATUA
public class Salbuespenak03 {
    public static void main(String[]args){
        int a=0;
        Scanner sc = new Scanner(System.in);
        while(a==0){
        System.out.println("Sartu nota mesedez:");
       try{ 
        int nota=Integer.parseInt(sc.nextLine());
        NotaKonprobatu(nota);
        if(nota<11&&nota>-1){
            a=1;
        }
       }
       catch(NumberFormatException e){
        System.err.println("Errorea: "+e.getMessage());
       }catch(IllegalArgumentException e){
        System.err.println("Errorea: "+e.getMessage());
       }
       
    }
    sc.close();
    }
    static void NotaKonprobatu(int nota){
        if(nota<0){
            throw new IllegalArgumentException("Nota ezin da 0 baino txikiagoa izan");
        }
        else if(nota>10){
            throw new IllegalArgumentException("Nota ezin da 10 baino handiagoa izan");
        }else{
            System.out.println("Nota onartua.");
        }
    }
}
