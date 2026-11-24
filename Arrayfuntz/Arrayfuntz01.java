package Arrayfuntz;
import java.util.Scanner;
public class Arrayfuntz01 {
//ADINEN BATAZBESTEKOA KALKULATU
   public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int adina[]=new int[20];
    int batezbest=0;
    adinaIrakurri(adina, sc);
    batezbest=mediaKalkulatu(adina);
    adinaImprimatu(adina, batezbest);
    sc.close(); 
 }   
 static int[] adinaIrakurri(int adina[], Scanner sc){
    System.out.println("Eskuz sartu nahi dituzu adinak edo random?(E/R)");
    if(sc.next().charAt(0)=='E'){
    for(int i=0;i<adina.length;i++){
        System.out.println("Sartu "+(i+1)+". adina mesedez:");
        adina[i]=sc.nextInt();
    }
    return adina;
    }
    else{
         for(int i=0;i<adina.length;i++){
        adina[i]=(int)(Math.random()*(25 - 18 + 1) + 18);
    }
    return adina;
    }
 }
 /**
  * //adinak irakurri eta batazbestekoa kalkulatu
  * @param adina
  * @return
  */
 static int mediaKalkulatu(int adina[]){
    int kont=0;
    for(int i=0;i<adina.length;i++){
        kont=kont+adina[i];
    }
    return kont/adina.length;
 }
 /**
  * //Datuak bistaratu
  * @param adina
  * @param batezbest
  */
 static void adinaImprimatu(int adina[], int batezbest){
    for(int i=0;i<adina.length;i++){
        System.out.println((i+1)+". garren adina: "+adina[i]);
    }
    System.out.println("Adinen batazbestekoa: "+batezbest);
 }
}
