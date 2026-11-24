import java.util.Scanner;
//zenbakiak sartu eta kontatu
    public class Ariketana09{
        public void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int bat=0, zenb,n=10 ;
            System.out.println("Sartu zenbaki osoak: ");
            while(n<10||bat<100){ 
                zenb=sc.nextInt();
                bat=bat+zenb;
                n++;
            }
            if(n>=10){
            System.out.println("10 zenbaki sartu dituzu jada, eta sartutako zenbakien batura "+bat+" da.");
            }
            else{
                System.out.println("Sartutako balioen batura 100 baino handiagoa da, zehazki: "+bat+" da.");
            }
            sc.close();
        }
    }