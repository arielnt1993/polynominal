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
    /*if the polynominal has a size of 1 it's number
    * must be a constant, therefore the poly is a
    * grade 0 poly.*/
    public void TestIfPolyIszeropoly(){
        assertEquals(1,poly.size());
    }
    /*@Test
    public void TestIfPolysAreEqual(){
        assertEquals(0,poly.compare());*/

}