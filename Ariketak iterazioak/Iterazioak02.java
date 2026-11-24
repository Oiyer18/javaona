import java.util.Scanner;
public class Iterazioak02 {
    public void main(String[]args){
        //zenbaki bat emanda bere biderketa tabla imprimatu
        Scanner sc=new Scanner(System.in);
        int a, n=1;
        System.out.println("Sartu zenbaki bat 1 eta 10 arte");
        a=sc.nextInt();
        if(a<=10 && a>=1){
        while(n<11){
            int biderketa= a*n;
            System.out.println(a+ " X "+ n +" = "+biderketa);
            n++;
        }
        }
        else{
            System.out.println("Sartu baliozko zenbaki bat.");
        }
        sc.close();
    }
    
}
