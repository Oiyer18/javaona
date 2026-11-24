import java.util.Scanner;
 public class Ariketabaldintzak05{
   public void main(String[]args){
    Scanner sc= new Scanner(System.in);
     double nota;

     System.out.println("Sartu nota:");
     nota= sc.nextDouble();
     if(nota>0 && nota<=10){
         if(nota<5){
        System.out.println("GUTXI");
     }
      if(nota<6 && nota>=5){
            System.out.println("NAHIKOA");
    }
     if(nota<7 && nota>=6){
        System.out.println("ONGI");
     }   
     if(nota<9 && nota>=7){
        System.out.println("OSO ONGI");
     }
     if(nota>=9){
        System.out.println("BIKAIN");
     }
     }
     else{
      System.out.println("Sartu baliozko nota bat.");
     }
     
    sc.close();
   } 
 }