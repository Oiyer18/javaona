import java.util.Scanner;
//bizitzaren ariketa
public class Ariketana08 {
    public void main(String[] args){
        //Bizitzaren ariketa
            Scanner sc = new Scanner(System.in);
        int bizitza=100, mina;
        while(bizitza>0){
            System.out.println("Gelditzen zaizun bizitza "+bizitza+" da.");
            mina=(int)((Math.random()*(19))+5);
            bizitza=bizitza-mina;
        }
        System.out.println("Game over.");
        sc.close();
    }
}
