package Array;

import java.util.Scanner;

public class Array05 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luzeena = 0, bostplus = 0;
        String hiriak[] = new String[10];
        String hiria;
        for (int i = 0; i < 10; i++) {
            System.out.println("Sartu " + (i + 1) + " hiriaren izena.");
            hiriak[i] = sc.next();
            if (i == 0) {
                luzeena = 0;
            }
            if (i > 0 && hiriak[i].length() > hiriak[i - 1].length()) {
                luzeena = i;
            }
            if (hiriak[i].length() > 5) {
                bostplus++;
            }
        }
            System.out.println("Letra gehien duen hiria: " + hiriak[luzeena] + " da. " + hiriak[luzeena].length()  + " letra ditu.");
            System.out.println("A-rekin hasten diren hiriak: ");
            for (int i = 0; i < 10; i++) {
                if (hiriak[i].charAt(0) == 'A' || hiriak[i].charAt(0) == 'a') {
                    System.out.print(hiriak[i] + ", ");
                }
            }
            System.out.println("Sartu hiriaren izena: ");
            hiria=sc.next();
            for(int i=0;i<10;i++){
                if(hiriak[i].equals(hiria)){
                    System.out.println(hiria+" hiria "+(i+1)+" posizioan dago.");
                }
            }
            System.out.println("5 karaktere baino gehiago dituzten hiri kopurua: "+bostplus+" da.");
            sc.close();
        
    }

}
