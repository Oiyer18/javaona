package objektuak.Laukizuzena;

public class Laukizuzenak {
    
        double oinarria;
        double altuera;

    public double kalkulatuAzalera(){
        return oinarria*altuera;
    }
    public double kalkulatuPerimetroa(){
        return 2*(oinarria+altuera);
    }
    public void erakutsiDatuak(double perimetroa, double azalera){
        System.out.println("Oinarria: "+oinarria);
        System.out.println("Altuera: "+altuera);
        System.out.println("Perimetroa: "+perimetroa);
        System.out.println("Azalera: "+azalera);
    }
}
