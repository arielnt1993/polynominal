import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Polynominal t = new Polynominal();
        for (int i = 0; i <10 ; i++) {
            Random rand = new Random();
            t.add(rand.nextInt(10));
        }
        System.out.println(t.toString());


    }
}
