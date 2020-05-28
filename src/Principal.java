import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        int[] coef = new int[3];
        coef[0]=1;

        coef[2]=3;
        Polynominal pol = new Polynominal(coef);
        pol.insert(5);


        Polynominal pol2 = new Polynominal(coef);
        pol2.insert(5);
        pol2.insert(9);
        pol2.insert(9);
        pol2.insert(9);
        System.out.println(pol);
        pol.add(pol2);

        System.out.println(pol2);
        System.out.println("luego de la suma");
        System.out.println(pol);
    }
}
