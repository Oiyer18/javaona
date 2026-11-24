package Errekurtsibitatea;
//ZIFRENBATURA
//KEPERESA NO KIERO HASER ESTO
public class Errekurtsibitatea04 {
    static void main(String[]args){
        int zenb=12345, i=0,k=zenb;
        while(k>1){
            k=k/10;
            i++;
        }
        zifrakbatu(zenb,0,0,i );
    }
    static int zifrakbatu(int zenb, int nose,int bat, int posizio){
        if(posizio>1){
            int ñ=posizio;
            while(ñ>1){
                nose=(int)zenb/10;
                ñ--;
            }
            posizio--;
            bat=bat+nose; 
            System.out.print(nose+" + ");
            
            return zifrakbatu(zenb,nose,bat,posizio);
        }else{
            System.out.print(bat);
            return bat;
        }
    }
}
