package objektuak.Bankua;

public class Kontuak {
    String titularra;
    int zenbakia;
    double saldoa;
    public void diruaSartu(double kopurua){
        saldoa+=kopurua;
    }
    public void diruAteria(double kopurua){
        saldoa-=kopurua;
    }
    public void saldoaErakutsi(){
        System.out.println("Kontuaren saldoa: "+saldoa);
    }
    public void datuakErakusti(){
        System.out.println("Kontuaren zenbakia: "+zenbakia);
        System.out.println("Kontuaren jabea: "+titularra);
        saldoaErakutsi();
    }
}
