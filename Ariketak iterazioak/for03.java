import java.util.Scanner;
public class for03 {
    public void main(String[]atgs){
        //100etik behera 7n bukatzen dian zenbakik
        Scanner sc= new Scanner(System.in);
        int i;
        System.out.println("100-etik behera 7 zenbakiarekin bukatzen diren zenbakiak:");
        for(i=97;i>0;i=i-10){
            System.out.println(i);
        }
        sc.close();
    }
}
