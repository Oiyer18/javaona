import java.util.Scanner;
public class Ariketana12 {
//Dorre zenbakia baino bata bestearen ondoan
    public void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,h,i,k;
        System.out.println("Sartu zenbaki bat:");
        n=sc.nextInt();
        for(h=0;h<n;h++){
            k=1;
            for(i=0;i<h+1;i++){
                System.out.print(k);
                k++;
                if(i==h){
                    System.out.print("\n");
                }
            }
        }
        sc.close();
    }    
}
