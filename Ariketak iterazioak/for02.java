import java.util.Scanner;
public class for02 {
    public void main(String[]args){
        //1etik 100era 5en multiploak
        Scanner sc= new Scanner(System.in);
        int i;
        System.out.println("1-etik 100-era 5-aren multiploak: ");
        for(i=1; i<=100; i++){
            if(i%5==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
