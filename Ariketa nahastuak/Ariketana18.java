import java.util.Scanner;
public class Ariketana18 {
   public void main(String[]args){
    Scanner sc= new Scanner(System.in);
        int n, kont=0;
        double i;
        i=(int)(Math.random()*(100))+1;
        System.out.println("1-100 ausazko zenbaki bat sortu da asmatu zazu 10 saiakera baino gutxiagotan:");
       do{
        System.out.println("Sartu zure "+(kont+1)+" saiakera:");
        System.out.println(i);
        n=sc.nextInt();
        if(n<1|| n>100){
            System.out.println("Sartutako zenbakia ez dago baimendutako limiteen artean, saiakera bat galdu dezu");
        }
        if(n>i){
            System.out.println("Sartutako zenbakia handiegia da.");
        }
        if(n<i){
            System.out.println("Sartutako zenbakia txikiegia da.");
        }
        kont++;

      /*   System.out.println(i);
        System.out.println(n);
        System.out.println(i!=n); */
       }
      while((i!=n) && (kont<11));
        switch(kont){
            case 1: case 2:
                 System.out.println(kont+ "Saiakera behar izan dituzu. Asmatu duzu, zorte onekoa zara, ezta?");
            break;
            case 3: case 4:
                System.out.println(kont+" Saiakera behar izan dituzu. Asmatu duzu, benetan azkarra zara!");
            break;
            case 5: case 6:
                System.out.println(kont+" Saiakera behar izan dituzu. Asmatu duzu, nahiko ondo moldatu zara.");
            break;
            case 7: case 8:
                System.out.println(kont+" Saiakera behar izan dituzu. Asmatu duzu, kostata ala?");
            break;
            case 9: case 10:
                System.out.println(kont+ "Saiakera behar izan dituzu. Asmatu duzu, baina hurrengorako laguntzarik behar al duzu?");
            break;
            default:
                System.out.println(kont+" Saiakera egin dituzu. Ez duzu zenbakia asmatzea lortu, saiatu berriro!");
            break;
        }
        System.out.println("Eskerrikasko jolasteagatik.");
    sc.close();
   } 
}
