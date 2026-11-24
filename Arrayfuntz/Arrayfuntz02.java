package Arrayfuntz;
import java.util.Scanner;
public class Arrayfuntz02 {
    //ZENBAKIEN MAIZTASUNA ERAKUTSI
    public void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int tamaina=20, BalioMax=9, BalioMin=1;
        taulaKargatu(sc, tamaina, BalioMax, BalioMin);
        frekuentziaErakutsi(taulaKargatu(sc, tamaina, BalioMax, BalioMin));
        ArrayErakutsi(taulaKargatu(sc, tamaina, BalioMax, BalioMin));

        sc.close();
    }
    /**
     * //BALOREAK EMAN
     * @param sc
     * @param tamaina
     * @param BalioMax
     * @param BalioMin
     * @return
     */
    static int[] taulaKargatu(Scanner sc, int tamaina, int BalioMax, int BalioMin){
        int taula[]=new int[tamaina];
        for(int i=0;i<taula.length;i++){
            taula[i]=(int)(Math.random()*(BalioMax-BalioMin+1))+BalioMin;
        }
        return taula;
    }
    /**
     * //FREKUENTZIA KALKULATU ETA GORDE
     * @param taula
     */
    static void frekuentziaErakutsi(int taula[]){
        int frek[]= new int[9];
        for(int i=0; i<taula.length;i++){
            for(int k=1; k<10;k++){
            if(taula[i]==k){
                frek[k-1]++;
            }
        }
        }
        for(int i=0;i<frek.length;i++){
            System.out.println((i+1)+" zenbakia "+frek[i]+" aldiz agertzen da");
        }
    }
    /**
     * //TAULA ERAKUTSI
     * @param taula
     */
    static void ArrayErakutsi(int taula[]){
        System.out.println("Taula erakutsiko da:");
        for(int i=0; i<taula.length;i++){
            System.out.print(" "+taula[i]);
        }
    }
}
