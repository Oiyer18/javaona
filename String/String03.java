package String;
import java.util.Scanner;
public class String03 {
    public void main(String[]args){
        Scanner sc= new Scanner(System.in);
         String txt;
         int luz;
         System.out.println("Idatzi nahi duzun testua:");
         txt=sc.nextLine();
         luz=txt.length();
         for(int i=luz-1; i>=0;i--){
            System.out.print(txt.charAt(i));
         }

        sc.close();
    }
}
