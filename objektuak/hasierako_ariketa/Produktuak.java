package objektuak.hasierako_ariketa;

public class Produktuak {  
        String izena;
        double prezioa;
        int stock;
    public void erakutsiInformazioa(){
        System.out.println("Izena: "+izena+"| Prezioa: "+prezioa+"| Stock: "+stock  );
    }
    public void aldatuPrezioa(double prezioBerria){
        prezioa=prezioBerria;
        System.out.println("Prezioa eguneratu da.");
    }
    public double kalkulatuBalioa(){
        System.out.println("Balioa: "+prezioa*stock);
        return prezioa*stock;
    }
    public void saldu(int kopurua){
        stock=stock-kopurua;
        System.out.println("Saldu da eta stockari kendu zaio");
    }
}
