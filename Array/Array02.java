package Array;

import java.util.Scanner;

public class Array02 {
    //20 adin eman eta batezbestekoa kalkulatu 18<adina<35
    public void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int adina[]= new int[19];
        double batezbest=0;
        for(int i=0;i<20;i++){
            adina[i]=0;
            while(adina[i]<18 || adina[i]>35){
             System.out.println("Sartu "+(i+1)+" datua mesedez.");
                adina[i]=sc.nextInt();
                if(adina[i]<18 || adina[i]>35){
                    System.out.println("Adinak 18 - 35 izan behar dira ");
                }
              
            }
            batezbest= batezbest + adina[i];
        }
        batezbest= batezbest/20;
        System.out.println("Sartutako adinen batezbestekoa: "+batezbest+" da.");
        sc.close();
    }
}
