package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class Erosketazerr {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a=0;
        ArrayList<String> Erosketa_lista = new ArrayList<>();
        Erosketa_lista.add("Esnea");
        Erosketa_lista.add("Arrautzak");
        Erosketa_lista.add("Sagarrak");
        while(a==0){
        menuaErakutsi();
        int aukera=sc.nextInt();
        switch (aukera) {
            case 0:
            a=1;
            System.out.println("\nEskerrikasko erabiltzeagatik.");
            break;
            case 1:
            produktGehitu(Erosketa_lista, sc);
            break;
            case 2:
            produktAldat(Erosketa_lista, sc);
            break;
            case 3:
            produktEzab(Erosketa_lista, sc);
            break;
            case 4:
            listaHas(Erosketa_lista, sc);
            break;
            case 5:
            zerrendaErakutsi(Erosketa_lista);
            break;
        }
        }
        sc.close();
    }
    static void menuaErakutsi(){
        System.out.println("    EROSKETA ZERRENDA ");
        System.out.println(" 1. Produktua gehitu");
        System.out.println(" 2. Produktua aldatu");
        System.out.println(" 3. Produktua ezabatu");
        System.out.println(" 4. Zerrenda hasieratu(hustu)");
        System.out.println(" 5. Produktuak zerrendatu");
        System.out.println(" 0. Irten");
    }
    static void produktGehitu(ArrayList<String> lista, Scanner sc){
        System.out.println("Zein produktu sartu nahi duzu?");
        lista.add(sc.next());
    }
    static void produktAldat(ArrayList<String> lista, Scanner sc){
        System.out.println("Zein produktu sartu nahi duzu?(zenbakia)");
        for(int i=0;i<lista.size();i++){
            System.out.println( (i+1)+". "+lista.get(i));
        }
        int a=sc.nextInt();
        System.out.println("Zein produkturen gatik aldatu nahi duzu?");
        lista.set((a-1), sc.next());
    }
    static void produktEzab(ArrayList<String> lista, Scanner sc){
        System.out.println("Zein produktu ezabatu nahi duzu?(zenbakia)");
         for(int i=0;i<lista.size();i++){
            System.out.println( (i+1)+". "+lista.get(i));
        }
        lista.remove((sc.nextInt()-1));
    }
    static void listaHas(ArrayList<String> lista, Scanner sc){
        System.out.println("Seguru zaude lista hasieratu nahi duzula?(B/E) Dena ezabatuko da.");
        char erantzuna = sc.next().charAt(0);
        if(erantzuna=='B'){
            lista.clear();
            System.out.println("Lista hasieratu da.");
        }else{
            System.out.println("Lista ez da hasieratu.");
        }
    }
    static void zerrendaErakutsi(ArrayList<String> lista){
        if(lista.size()==0){
            System.out.println("Zerrenda hutsa dago.");
        }else{
            System.out.println("|-------ZURE LISTA--------|");
            for(int i=0;i<lista.size();i++){
                System.out.print("| "+(i+1)+". "+lista.get(i)+" ");
                for(int j=0;j<20-lista.get(i).length();j++){
                    if(j==20-lista.get(i).length()-1){
                        System.out.print("-| \n");
                    }else{
                    System.out.print("-");
                    }
                }
                
            }
        }
    }
}
