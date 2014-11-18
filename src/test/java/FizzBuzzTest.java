import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FizzBuzzTest {
    FizzBuzz fizzbuzz;

    @Before
    public void setUp(){
        fizzbuzz = new FizzBuzz();
    }
    @Test
    public void isDivisibleByThree(){
        assertTrue(fizzbuzz.isDivisibleByThree(3));
    }

    @Test
    public void isNotDivisibleByThree(){
        assertFalse(fizzbuzz.isDivisibleByThree(1));
    }

    @Test
    public void isDivisibleByFive(){
        assertTrue(fizzbuzz.isDivisibleByFive(5));
    }

    @Test
    public void isNotDivisibleByFive(){
        assertFalse(fizzbuzz.isDivisibleByFive(1));
    }
}