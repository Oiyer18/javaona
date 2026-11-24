package Array;

public class Array04 {
    public void main(String[] args) {
        int array[] = new int[20], kont[] = new int[10];
        for (int i = 0; i < 20; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.println(array[i]);
            kont[array[i]]++;
        }
        for(int n=0; n<=9;n++ ){
            System.out.println(n+" Balorea "+kont[n]+" aldiz registratu da.");
        }
    }
}
