import java.util.Scanner;
public class Iterazioak03 {
 public void main(String[]args){
    //bi zenbabki emanda jartzen ditu tarte horren barruan dauden 3ko multiplo guztiak
    Scanner sc= new Scanner(System.in);
    int a,b,n;
    System.out.println("Sartu lehenengo zenbakia:");
    a=sc.nextInt();
    System.out.println("Sartu lehenengo zenbakia:");
    b=sc.nextInt();
    n=0;
    
    if(b<a || a==b){
        if(a==b){
            System.out.println("Zenbakiak ezin dira berdinak izan.");
        }
        else{
            System.out.println("Bigarren zenbakia lehenengoa baino txikiagoa da.");
        }
    }
    else{
        while(a+n<=b && a+n>=a ){
            int i=a+n; 
            if(i%3==0){
            System.out.println(i);
            }
            n++;
        }
    }
   sc.close();
 }   
}
