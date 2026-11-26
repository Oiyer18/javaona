package objektuak.Laukizuzena;
import java.util.Scanner;
public class Main {
    public void main(String[]args){
        
    double azalera=0, perimetroa=0;
    Scanner sc= new Scanner(System.in);

    Laukizuzenak l1 = new Laukizuzenak();

    System.out.println("Sartu lehenengo laukizuzenaren altuera: ");
    l1.altuera=sc.nextDouble();
    System.out.println("Sartu lehenengo laukizuzenaren oinarria: ");
    l1.oinarria=sc.nextDouble();

    Laukizuzenak l2 = new Laukizuzenak();

    System.out.println("Sartu bigarren laukizuzenaren altuera: ");
    l2.altuera=sc.nextDouble();
    System.out.println("Sartu bigarren laukizuzenaren oinarria: ");
    l2.oinarria=sc.nextDouble();

    azalera=l1.kalkulatuAzalera();
    perimetroa=l1.kalkulatuPerimetroa();
    l1.erakutsiDatuak(perimetroa,azalera);

    azalera=l2.kalkulatuAzalera();
    perimetroa=l2.kalkulatuPerimetroa();
    l2.erakutsiDatuak(perimetroa,azalera);

    if(l1.kalkulatuAzalera()>l2.kalkulatuAzalera()){
        System.out.println("Lehenengo laukizuzenaren azalera handiagoa da");
    }else{
        System.out.println("Bigarren laukizuzenaren azalera handiagoa da");
    }
    sc.close();
    } 
}

