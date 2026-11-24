package Errekurtsibitatea;

public class Errekurtsibitatea02 {
    //ZENBAKI BATEN BERRETURA
    public static void main(String[]args){
        System.out.print(berretura(2, 5, 1));
    }
    static int berretura(int a, int b, int c){
        if(b>0){
            c=c*a;
            return berretura(a,b-1,c);
        }else{
            if(c==1){
                return 1;
            }else{
            return c;
            }
        }
    
    }
}