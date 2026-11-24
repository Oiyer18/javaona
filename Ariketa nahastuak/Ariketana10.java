import java.util.Scanner;
public class Ariketana10 {
    public void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n, j, i;
        System.out.println("Sartu zenbaki bat: ");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
                if(i==j){
                    System.out.print("\n");
                }
            }
        }
        sc.close();
    }
}
