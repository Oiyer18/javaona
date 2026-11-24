package Arrayfuntz;
import java.util.Scanner;
public class Arrayfuntz05 {
    //0-ak BUKAERARA
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         int luzeera=0, BalMax=20, BalMin=0;
        System.out.println("Zer luzerakoa nahi dezu array-a?");
        luzeera=sc.nextInt();
        int datuak[]=new int[luzeera],datutxak[]=new int[luzeera];
        datuak=datuaKargatu(luzeera, BalMax, BalMin);
        arrayerakutsi(datuak);
        System.out.print("\n");
        datutxak=zeroakMugitu(datuak);
        arrayerakutsi(datutxak);
        sc.close();
    }
    /**
     * 
     * @param a
     * @param BalMax
     * @param BalMin
     * @return
     */
    static int[] datuaKargatu(int a, int BalMax, int BalMin){
        int[]datuak= new int[a];
        for(int i=0;i<datuak.length;i++){
            datuak[i]=(int)(Math.random()*(BalMax-BalMin+1))+BalMin;
        }
        return datuak;
    }
    /**
     * 
     * @param datuak
     */
    static void arrayerakutsi(int[] datuak){
        for(int i=0;i<datuak.length;i++){
            System.out.print(" "+datuak[i]);
        }
    }
    //BUKATZEKO!!!!!!
    static int[] zeroakMugitu(int[]datuak){
       for(int i=0;i<datuak.length;i++){
        for(int j=0;j<datuak.length-1-i;j++){
            if(i!=datuak.length-1){
            if(datuak[j]==0){
                int k=datuak[j];
                datuak[j]=datuak[j+1];
                datuak[j+1]=k;
            }
        }
        }
    }
        return datuak;
    }
        
    
}

