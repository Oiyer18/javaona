package Array;

import java.util.Scanner;

public class Array06 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Zenbat ikasle dira?");
        n = sc.nextInt();
        String izenak[] = new String[n];
        double notak[] = new double[n];
        double batezbest=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Sartu "+(i+1)+" izena:");
            izenak[i]=sc.nextLine();
            System.out.println("Sartu nota:");
            notak[i]= sc.nextDouble();
            batezbest= batezbest+notak[i];
        }
        batezbest= batezbest/n;
        for(int i=0; i<n; i++){
            System.out.println("*"+ izenak[i]+" - "+notak[i]);
        }
        System.out.println("Klasearen batazbestekoa: " +batezbest+" da.");
        System.out.println(batezbest+ " baino gehiago duten ikasleak: ");
        for(int i=0; i<n; i++){

        }

        sc.close();
    }
}
