import java.util.Scanner;
public class Iterazioak05 {
    public void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int k=1, bik=0, bak=0;
        System.out.println("Sartu zenbaki osoak, bukatu 0 zenbakia sartuz:");
        while(k!=0){
            k=sc.nextInt();
            if(k%2==0 && k!=0){
                bik++;
            }
            else{
                bak++;
            }

        }
        System.out.println("Zenbaki bakoitien kopurua: "+bak+" da. \nZenbaki bikoitien kopurua: "+bik+" da.");
        sc.close();
    }
}
