import static org.junit.Assert.*;
import  org.junit.Before;
import  org.junit.Test;

import java.util.NoSuchElementException;
public class PolynominalTest {
    private Polynominal poly;
    @Before
    public void setup(){
        poly = new Polynominal();
    }

    @Test
    public void TestIfPolyIszeropoly(){
        assertEquals(1,poly.size());
    }
    @Test
    public void TestIfPolyHasRigthOrder(){
        int[] test = new int[3];
        for (int i = 0; i <test.length ; i++) {test[i] = i+1;}
        Polynominal poly = new Polynominal(test);
        assertEquals("P(x) = 3x^2+2x^1+1",poly.toString());
    }
    @Test
    public void TestIfPolyOmitsZeroes(){
        int[] test = new int[3];
        for (int i = 0; i <test.length ; i++) {test[i] = i;}
        Polynominal poly = new Polynominal(test);
        assertEquals("P(x) = 2x^1+1",poly.toString());
    }
    @Test
    public void TestIfInsertWorksProperly(){}
    @Test
    public void TestIfAddWorksProperlyIfEqual(){
        int[] test = new int[3];
        for (int i = 0; i <test.length ; i++) {test[i] = i;}
        Polynominal poly = new Polynominal(test);
        Polynominal poly2 = new Polynominal(test);
        poly.add(poly2);
        assertEquals("P(x) = 4x^1+2",poly.toString());
    }
    @Test
    public void TestIfAddWorksProperlyIfANumberIsNegative(){
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
        assertEquals("P(x) = 4x^1+2",poly.toString());
    }

    @Test
    public void TestIfAddWorksProperlyIfFirstPolyIsBigger(){
        int[] test = new int[3];
        for (int i = 0; i <test.length ; i++) {test[i] = i;}
        Polynominal poly = new Polynominal(test);
        poly.insert(5);
        Polynominal poly2 = new Polynominal(test);
        poly.add(poly2);
        assertEquals("P(x) = 5x^2+4x^1+2",poly.toString());
    }
    @Test
    public void TestIfAddWorksProperlyIfItemBeignAddedIsBiggerThanTheFirstPoly(){
        int[] test = new int[3];
        for (int i = 0; i <test.length ; i++) {test[i] = i;}
        Polynominal poly = new Polynominal(test);
        Polynominal poly2 = new Polynominal(test);
        poly2.insert(5);
        poly.add(poly2);
        assertEquals("P(x) = 5x^2+4x^1+1",poly.toString());
    }
    @Test
    public void TestIfWhenXIsGivenThePolyWillHaveTheCorrectResult(){
        int[] test = new int[3];
        for (int i = 0; i <test.length ; i++) {test[i] = i+1;}
        Polynominal poly = new Polynominal(test);
        assertEquals(11.0,poly.valueOf(11),1);
    }
    @Test
    public void TestIfToStringWorkProperly(){
        int[] test = new int[3];
        for (int i = 0; i <test.length ; i++) {test[i] = -i;}
        Polynominal poly = new Polynominal(test);
        assertEquals("P(X) = (-2)x^1+(-1) ",poly.toString());
    }

}