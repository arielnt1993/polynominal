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

    /*@Test
    public void TestIfPolyIszeropoly(){
        assertTrue(poly.zeroGrade());
    }
    @Test
    public void TestIfPolysAreEqual(){
        assertEquals(0,poly.compare());
    }*/
    @Test
    public void TestExpIsRight(){
        int[] a = new int[3];
        for (int i = 0; i <a.length ; i++) {
            a[i] = i+1;
        }
        Polynominal t = new Polynominal(a);

        assertEquals(1,t.getExp(1));
    }
}