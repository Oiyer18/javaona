//package ariketa2;

/**
 * Programa hau sortu hurrengo kodearekin. Exekutatu lerroz lerro ikusteko 
 * zein balio duen 'emaitza' aldagaiak adierazpen bakoitzean eta programa amaitzean.
 */
public class Debug1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 40;
        int d = 35;
        // emaitza=(10+20)/2=30/2=15
        int emaitza = (a + b) / 2;
        //emaitza=15*35=525
        emaitza = d * emaitza;
        //emaitza=525+(40/2)=545
        emaitza += (c / 2);
        
        System.out.println("Emaitza hau da: " + emaitza);
    }
}
