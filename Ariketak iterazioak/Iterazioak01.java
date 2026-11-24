import java.util.Scanner;

public class Iterazioak01 {
    public void main(String[]args){
        //Txikitik handira 1-10 zenbaki guztiak imprimatu eta gero berdina handitik txikira
        Scanner sc= new Scanner(System.in);
        int n=1;
        System.out.println("Txikitik handira: ");
        while(n<11){
            System.out.println(n);
            n++;
        }
        System.out.println("Handitik txikira: ");
        n--;
        while(n>0){
            System.out.println(n);
            n--;
        }
    

        sc.close();
    }
}
