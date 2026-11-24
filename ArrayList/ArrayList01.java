package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList01 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> hiriak = new ArrayList<>();
        System.out.println("Mesedez sartu 5 hiri");
        for(int i=0; i<5;i++){
            System.out.println("Sartu "+(i+1)+". hiria mededez");
            hiriak.add(sc.next());
        }
        for(int i=0;i<hiriak.size();i++){
            System.out.print(" "+(i+1)+". "+hiriak.get(i));
        }
        System.out.println("\nGehitu beste hiri bat:");
        hiriak.add(sc.next());
        System.out.println("Zerrendako lehen hiria: "+hiriak.get(0));
        System.out.println("Zerrendako azken hiria: "+hiriak.get(hiriak.size()-1));
        System.out.println("Guztira dauden hiri kopurua: "+hiriak.size());
        System.out.println("Zerrenda alfabetikoki ordenatua: ");
        hiriak.sort(null);
        System.out.println(hiriak);
        sc.close();
    }
}
