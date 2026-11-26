package objektuak.Liburuak;

public class Liburuak {
    String izenburua, egilea;
    int orrialdekop;
    boolean irakurrita=false;

    public void irakurri(){
        irakurrita=true;
    }

    public void informazioaErakutsi(){
        System.out.println("Izenburua: "+izenburua);
        System.out.println("Egilea:: "+egilea);
        System.out.println("Orrialde kopurua: "+orrialdekop);
        irakurritaDago();
    }
    public void irakurritaDago(){
        if(irakurrita==true){
            System.out.println("Liburua irakurri da.");
        }else{
            System.out.println("Liburua ez da irakurri oraindik");
        }
    }
}
