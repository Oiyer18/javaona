import java.util.Scanner;
    public class Ariketabaldintzak04 {
        public void main(String[]args){
            Scanner sc= new Scanner(System.in);
            double dirua, prezioa;
            System.out.println("Zenbat balio du erosketa?");
            prezioa= sc.nextDouble();
            System.out.println("Zenbat diru daukazu?");
            dirua=sc.nextDouble();
            if(prezioa>dirua){
                System.out.println("Dirua falta zaizu");
            }
            else{
                double bueltak=dirua-prezioa;
                System.out.println("Zure bueltak: "+bueltak);
            }
            sc.close();
        }
}
