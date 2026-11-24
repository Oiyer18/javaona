package Array;

public class Array03 {
    //20 zenbaki eman eta posizio bikoitikoak bat eta posizio bakoitikoak biderkatu
    public void main(String[] args) {
        int array[] = new int[20];
        int bat = 0;
        long bider = 1;
        for (int i = 0; i <= 19; i++) {
            array[i] = (int) (Math.random() * 101);
            System.out.println(array[i]);
        }
        for (int n = 0; n < 10; n++) {
            bat = bat + array[2 * n];
            bider = bider * array[2 * n + 1];
        }
        System.out.println("posizio bikoitien batuketa: "+bat+" da. Posizio bakoitien biderketa: "+bider+" da.");
    }
}
