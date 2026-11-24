import java.util.Scanner;
    public class Ariketabaldintzak03 {
        public void main(String[]args){
            Scanner sc= new Scanner(System.in);
            int a; 
            double b, milako, ehuneko, hamarreko, bateko;
            System.out.println("Sartu 4 zifrako zenbaki bat mesedez:");
            a=sc.nextInt();
            b=a/1000;
            if(1<=b && b<10){
                milako = Math.floor((a/1000));
                 int milak=(int)milako;
                ehuneko = Math.floor((a-milako*1000)/100);
                 int ehunek= (int)ehuneko;
                hamarreko = Math.floor((a-milako*1000 - ehuneko*100)/10);
                 int hamarrek=(int)hamarreko;
                bateko = Math.floor((a-milako*1000- ehuneko*100 - hamarreko*10));
                 int batek=(int)bateko;
                 int batura = milak + ehunek + hamarrek+ batek;
                System.out.println("Digitoen batura "+ batura +" da.");
            }
            else{
       System.out.println("Zenbakiak ez dazka 4 zifra");
            }
            sc.close();
        }
}
