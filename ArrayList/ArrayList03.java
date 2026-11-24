package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList03 {
    //KUENTAKILOMETRO
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> kilometroak = new ArrayList<>();
        System.out.println("Sartu egun guztietan egindako kilometroak, sartu 0 bukatzeko eta gehiago ez sartzeko");
        double a=1; int kont=0, bost=0;
        while(a!=0){
            System.out.println("Sartu "+(kont+1)+" egunean egindako kilometroak");
            a=sc.nextDouble();
            if(a==0){
                System.out.println("Eskerrikasko datuengatik :)");
            }else{
                kilometroak.add(a);
                 if(a>5){
                    bost++;
                }
            }
        }
        if(kilometroak.size()!=0){
        System.out.println("Zure datuak: "+kilometroak);
        double guztira=0;
        for(int i=0;i<kilometroak.size();i++){
            guztira=guztira+kilometroak.get(i);
        }
        System.out.println("Guztira egindako kilometroak: "+guztira+" km");
        System.out.println(kilometroak.size()+" egun egin dituzu korrika, zure eguneko media: "+guztira/kilometroak.size()+" km");
        kilometroak.sort(null);
        System.out.println("Egin duzun distantzia handiena: "+kilometroak.get(kilometroak.size()-1)+" km");
        System.out.println("Egin duzun distantzia txikiena: "+kilometroak.get(0)+" km");
        System.out.println("5 km baino gehiago egin diren egun kopurua: "+bost);
       
        }else{
            System.out.println("Ez duzu kilometrorik egin.");
        }
    sc.close();
}
}
