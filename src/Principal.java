import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        int[] coef = new int[3];
        for (int i = 0; i <coef.length ; i++) {
            coef[i] = i+1;
        }
        Polynominal pol = new Polynominal(coef);
        System.out.println(pol);
        System.out.println(pol.valueOf(2));
    }
}
