package ArrayList;
import java.util.ArrayList;
public class ArrayList00{
    public static void main(String[]args){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ogia");
        lista.add("Esnea");
        lista.add("Arrautzak");
        lista.add("Sagarrak");
        System.out.print(lista);
        lehenaOrdezkatu(lista);
        lehenaEzabatu(lista);
    }
    static void lehenaOrdezkatu(ArrayList<String> lista){
        lista.set(0,"Txorizoa");
        System.out.print("\n"+lista);
    }
    static void lehenaEzabatu(ArrayList<String> lista){
        lista.remove(0);
        System.out.print("\n"+lista);
        lista.clear();
        System.out.print("\n"+lista);
    }
   
}