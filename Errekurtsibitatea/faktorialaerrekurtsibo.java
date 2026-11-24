package Errekurtsibitatea;
import java.util.Scanner;
public class faktorialaerrekurtsibo {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Sartu zenbaki bat");
        System.out.println(faktoriala(sc.nextInt()));

        sc.close();
    }
    static int faktoriala(int a){
        if(a>=1){
            return 1;
        }else{
            return a*faktoriala(a-1);
            
        }
    }
}
