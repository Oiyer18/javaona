package objektuak.Liburuak;

public class Main {
    public static void main(String[]args){
        Liburuak l1 = new Liburuak();
        Liburuak l2 = new Liburuak();
        Liburuak l3 = new Liburuak();

        l1.egilea="Oier Bocos";
        l1.izenburua="El capital";
        l1.orrialdekop=1000;
        
        l2.egilea="Andoni Susin";
        l2.izenburua="Que hacer?";
        l2.orrialdekop=200;

        l3.egilea="Asier Gonzalez";
        l3.izenburua="Endnotes2";
        l3.orrialdekop=400;

        l1.irakurri();

        l3.irakurri();

        l1.informazioaErakutsi();
        l2.informazioaErakutsi();
        l3.informazioaErakutsi();
        
    }
}
