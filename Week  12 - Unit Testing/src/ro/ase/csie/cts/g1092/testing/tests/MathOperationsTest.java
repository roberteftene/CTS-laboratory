package ro.ase.csie.cts.g1092.testing.tests;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ro.ase.csie.cts.g1092.testing.exceptions.DivisionByZeroException;
import ro.ase.csie.cts.g1092.testing.models.MathOperations;

import static org.junit.Assert.fail;

public class MathOperationsTest  {

    @Before
    public void setUp() throws Exception {
        System.out.println("Hello from Test Case");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Clean up");
    }

    @Test
    public void testAdd() {
        int a = 5,
                b = 5,
                expectedValue = 10,
                result = MathOperations.add(a, b);

        Assert.assertEquals("Testing adding 2 int values",expectedValue,result);
    }

    @Test
    public void testDivide() throws DivisionByZeroException {
        int a = 5,
                b = 5,
                expectedValue = 1;
        double result = MathOperations.divide(a,b);
        Assert.assertEquals("Testing dividing 2 values",expectedValue,(int)result);
    }
}