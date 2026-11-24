package Arrayfuntz;
import java.util.Scanner;
public class Arrayfuntz03 {
    //IZENAK ETA KALIFIKAZIOAK
    public void main(String[]args){
    Scanner sc =new Scanner(System.in);
        int[] notak=new int[10];
        String[] izenak=new String[10];
        izenaKargatu(izenak, sc);
        notaKargatu(notak);
        datuakErakutsi(notak, izenak);
        datuenKalkuloa(notak);
        EstatistikakErakutsi(notak, izenak, datuenKalkuloa(notak));

    sc.close();
    }
    /**
     * //IZEN GUZTIAK IRAKURRI
     * @param izenak
     * @param sc
     * @return
     */
    static String[] izenaKargatu(String izenak[], Scanner sc){
        for(int i=0;i<izenak.length;i++){
            System.out.println("Sartu "+(i+1)+" izena:");
            izenak[i]=sc.nextLine();
        }
        return izenak;
    }
    /**
     * //NOTA GUZTIAK IRAKURRI(RANDOM)
     * @param notak
     * @return
     */
    static int[] notaKargatu(int notak[]){
        for(int i=0; i<notak.length;i++){
            notak[i]=(int)(Math.random()*(10))+1;
        }
        return notak;
    }
    /**
     * //DATUAK ERAKUTSI
     * @param notak
     * @param izenak
     */
    static void datuakErakutsi(int notak[],String izenak[] ){
        for(int i=0;i<izenak.length;i++){
            System.out.println((i+1)+" "+izenak[i]+"-k "+notak[i]+" atera du");
        }
    }
    /**
     * //DATUAK KALKULATU
     * @param notak
     * @return
     */
    static int[] datuenKalkuloa(int notak[]){
        int[] statisk= new int[10];
        int kont=0;
        statisk[1]=0;
        statisk[2]=10;
        for(int i=1; i<notak.length+1;i++){
            kont=kont+notak[i-1];
            if(i!=10){
                if(notak[i]>statisk[1]){
                    statisk[1]=notak[i];
                }
                if(notak[i]<statisk[2]){
                    statisk[2]=notak[i];
                }
             }
        }
        statisk[0]=kont/notak.length;
        return statisk;

    }
    /**
     * //ESTATISTIKAK ERAKUTSI
     * @param notak
     * @param izenak
     * @param estadistikak
     */
    static void EstatistikakErakutsi(int[] notak, String[] izenak, int[]estadistikak){
        int pertsonaMax=0, pertsonaMin=0;
        System.out.println("Klasearen batazbestekoa: "+estadistikak[0]);
        for(int i=0;i<notak.length;i++){
            if(notak[i]==estadistikak[1]){
                pertsonaMax=i;
            }
            if(notak[i]==estadistikak[2]){
                pertsonaMin=i;
            }
        }
        System.out.println("nota altuena: "+estadistikak[1]+" eta nota hori atera duen pertsona bat: "+izenak[pertsonaMax]);
        System.out.println("nota baxuena: "+estadistikak[2]+" eta nota hori atera duen pertsona bat: "+izenak[pertsonaMin]);
    }

}
