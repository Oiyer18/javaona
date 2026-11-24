package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList02 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>zenbakiak = new ArrayList<>();
        System.out.println("Sartu 10 zenbaki mesedez");
        for(int i=0; i<10;i++){
            System.out.println("Sartu "+(i+1)+". zenbakia mesedez:");
            zenbakiak.add(sc.nextInt());
        }
        ArrayList<Integer>kopia = (ArrayList<Integer>) zenbakiak.clone();
        System.out.println("Zerrenda originala: "+zenbakiak);
        System.out.println("Zerrenda kopia: "+kopia);
        kopia.sort(null);
        kopia.remove((int)(Math.random()*zenbakiak.size()));
        System.out.println("Berriro erakutsiko dira bi zerrendak.");
        
        sc.close();
    }
}
