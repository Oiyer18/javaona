package Errekurtsibitatea;
//HITZ BATI BUELTA EMAN
public class Errekurtsibitatea03 {
    public static void main(String[]args){
        buelta("JAVA", 0);
    }
    /**
     * 
     * @param hitza
     * @param n
     * @return
     */
    static char buelta(String hitza, int n){
        
       if(n<hitza.length()){
        System.out.print(hitza.charAt(hitza.length()-1-n));
        return buelta(hitza,n+1);
       }
       else{
        return '.';
       }
    }
}
