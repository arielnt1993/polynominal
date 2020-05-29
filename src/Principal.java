import java.util.Random;
//dont know how to use epsilon on assertEquals for float float
public class Principal {
    public static void main(String[] args) {
        int[] test = new int[3];
        int[] test2 = new int[3];
        test[0]=2;
        test[1]=4;
        test[2]=1;
        test2[0]=-2;
        test2[1]=4;
        test2[2]=-9;
        Polynominal poly = new Polynominal(test);
        Polynominal poly2 = new Polynominal(test2);
        poly.add(poly2);
        System.out.println(poly);
    }
}
