package Errekurtsibitatea;

public class Errekurtsibitatea01 {
    //N+(N-1)+(N-2)+...
    public static void main(String[]args){
        erakutsi(batura(6, 0));
    } 
    /**
     * 
     * @param n
     * @param b
     * @return
     */
    static int batura(int n, int b){
        if(n>0){
                System.out.print(n);
                if(n!=1){
                    System.out.print(" + ");
                }
                b=b+n;
                return batura(n-1, b);
        }
        else{ 
        return b;
        }
    }
    /**
     * 
     * @param n
     */
    static void erakutsi(int n){
        System.out.println(" Batura = "+n);
    }
}
