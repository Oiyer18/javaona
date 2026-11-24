import java.util.Scanner;
public class Ariketana05 {
    public void main(String[]args){
        //bankuaren ariketa
        Scanner sc= new Scanner(System.in);
        int saldoa=1000, i,dirua=0;       
        do{
             System.out.println("Zer egin nahi duzu?\n 1.Dirua sartu   2.Dirua atera\n 3.Saldoa ikusi  4.Irten");
         i=sc.nextInt();
        switch(i){
            case 1:
             
            System.out.println("Zenbat diru sartu nahi dezu?");
            dirua=sc.nextInt();
            saldoa=saldoa+dirua;
            break;
            case 2:
                if(dirua<=saldoa){
                System.out.println("Zenbat diru atera nahi dezu?");
                dirua=sc.nextInt();
              /*   if(dirua>saldoa){
                    System.out.println("Ez daukazu hainbeste dirurik");
                    dirua=0;
                } */
                if(saldoa-dirua<0){
                    System.out.println("Ez daukazu hainbeste dirurik");
                    dirua=0;
                }
            }
            saldoa=saldoa-dirua;
            break;
            case 3:
                System.out.println("Zure saldoa: "+saldoa+"€koa da.");
            break;
            case 4:
                i=4;
                break;
        }
     }
        while(i!=4);
        System.out.println("Eskerrikasko erabiltzeagatik.");
        sc.close();
    
}
}
