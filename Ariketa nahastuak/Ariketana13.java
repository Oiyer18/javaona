import java.util.Scanner;
//zenbakitorrea
public class Ariketana13 {
    public void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n, i, j,h=1;
        System.out.println("Idatzi zenbaki bat: ");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<i+1;j++){
                System.out.print(h+" ");
                h++;
                if(i==j){
                    System.out.print("\n");
                }
            }
        }
        sc.close();
    }
}
