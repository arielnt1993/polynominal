import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = -1;
        a[2] = -3;
        Polynominal t = new Polynominal(a);
        /*for (int i = 0; i <10 ; i++) {
            Random rand = new Random();
            t.add(rand.nextInt(10));
        }*/
        /*t.add(2);
        t.add(3);
        t.add(5);
        t.setCoef(10,0);*/
        t.add(6);

        System.out.println(t.toString());
        /*if (f != 0){
        System.out.println(t.get(t.size()-1));}*/


    }
}
