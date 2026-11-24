import java.util.Scanner;
    public class Datusarrerak3 {   
        public static void main(String[]args){
            Scanner sc =new Scanner (System.in);
            double prezioa;
            System.out.println("Sartu prezioa mesedez");
            prezioa=sc.nextDouble();
            prezioa=prezioa*1.21;
            System.out.println("Bukaerako prezioa: "+prezioa+" da.");             

            sc.close();
    }    
}
