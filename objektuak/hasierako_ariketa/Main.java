package objektuak.hasierako_ariketa;

public class Main {
    public void main(String[]args){
   
        Produktuak p1 =new Produktuak();
        p1.izena ="java liburua";
        p1.prezioa= 30.00;
        p1.stock=20;

        Produktuak p2= new Produktuak();
        p2.izena="html liburua";
        p2.prezioa=25.99;
        p2.stock=3;

        Produktuak p3 = new Produktuak();
        p3.izena="Datubase liburua";
        p3.prezioa=43.89;
        p3.stock=89;

        p1.erakutsiInformazioa();
        p1.aldatuPrezioa(p1.prezioa*2);
        p1.erakutsiInformazioa();
        p1.kalkulatuBalioa();
        p1.saldu(1);
        p1.erakutsiInformazioa();

    }
}
    