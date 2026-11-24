import java.util.Scanner;
public class Ariketabaldintzak01 {
    public static void main(String[]args){
         Scanner sc= new Scanner(System.in);
       
        int zenb1, zenb2;
        System.out.println("saatu zenbaki oso bat mesedez");
        zenb1=sc.nextInt();
        System.out.println("Sartu beste zenbaki bat mesedez");
        zenb2=sc.nextInt();
        if(zenb1==zenb2){   
            System.out.println("Sartutako zenbakiak berdinak dira");
        }
        
     if(zenb1<zenb2){
        System.out.println(zenb2+" zenakia"+ zenb1+ " baino handiagoa da.");
     }   
     if(zenb2<zenb1){
        System.out.println(zenb1+" zenbakia"+ zenb2 +" baino handiagoa da.");

     }
     sc.close();
    }
        
    }
