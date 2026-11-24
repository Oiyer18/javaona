import java.util.Scanner;
public class Ariketabaldintzak06 {
    public void main(String[]args){
        Scanner sc= new Scanner(System.in);
            int a;
            System.out.println("Sartu hilabetearen zenbakia mesedez");
            a=sc.nextInt();
            if(a>0 && a<13){
                switch (a) {
                    case 1:
                        System.out.println("Urtarrila");
                        break;
                    case 2:
                        System.out.println("Otsaila");
                        break;
                    case 3:
                        System.out.println("Martxoa");
                        break;
                    case 4:
                        System.out.println("Apirila");
                        break;
                    case 5:
                        System.out.println("Maiatza");
                        break;
                    case 6:
                        System.out.println("Ekaina");
                        break;
                    case 7:
                        System.out.println("Uztaila");
                        break;
                    case 8:
                        System.out.println("Abuztua");
                        break;
                    case 9:
                        System.out.println("Iraila");
                        break;
                    case 10:
                        System.out.println("Urria");
                        break;
                    case 11:
                        System.out.println("Azaroa");
                        break;
                        case 12:
                            System.out.println("Abendua");
                            break;
                }
            }
            else{
                System.out.println("Sartu baliozko zenbaki bat");
            }
            sc.close();
        
    }
}
