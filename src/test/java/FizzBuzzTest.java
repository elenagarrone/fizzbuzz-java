import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FizzBuzzTest {
    @Test
    public void isDivisibleByThree(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertTrue(fizzbuzz.isDivisibleByThree(3));
    }

    @Test
    public void isNotDivisibleByThree(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertFalse(fizzbuzz.isDivisibleByThree(1));
    }

    @Test
    public void isDivisibleByFive(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertTrue(fizzbuzz.isDivisibleByFive(5));
    }

    @Test
    public void isNotDivisibleByFive(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertFalse(fizzbuzz.isDivisibleByFive(1));
    }
}