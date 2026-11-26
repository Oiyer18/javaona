package objektuak.Bankua;

public class Main {
    public void main(String[]args){
        Kontuak k1 = new Kontuak();
        k1.titularra="Oier";
        k1.zenbakia=1880;
        k1.saldoa=3000;

        k1.diruaSartu(250.8);
        k1.diruAteria(300.2);
        k1.saldoaErakutsi();
        k1.diruAteria(40000);
        k1.datuakErakusti();
    }
}
