import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        Polynominal t = new Polynominal(a);
        Polynominal x = new Polynominal(a);
        x.insert(5);
        t.insert(6);
        t.insert(8);
        System.out.println("poli nuevo: "+x.toString());
        t.add(x);
        System.out.println("poli al que se le agrega: "+t.toString());



    }
}
