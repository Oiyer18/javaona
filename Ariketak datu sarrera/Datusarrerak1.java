import java.util.Scanner;
     public class Datusarrerak1{
        public static void main(String[] args){
            String izena; int adina;
       Scanner sc= new Scanner(System.in);
            System.out.println("Sartu zure izena:");
            izena= sc.nextLine();
            System.out.println("Sartu zure adina:");
            adina= sc.nextInt();
            System.out.println("Kaixo "+izena+" zure adina "+adina+" da.");
         sc.close();
        }
    }
