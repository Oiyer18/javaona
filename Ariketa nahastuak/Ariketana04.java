import java.util.Scanner;
public class Ariketana04 {
    public void main(String[]args){
        //1-10 ausazko zenbakia
         Scanner sc= new Scanner(System.in);
        int n;
        double i;
        i=(int)(Math.random()*(10))+1;
       do{
       /*  System.out.println(i); */
        System.out.println("Sartu zenbakiak asmatu arte: ");
        n=sc.nextInt();
       }
        while(n!=i);
        System.out.println("Zorionak asmatu duzu.");
        sc.close();
    }
}
