import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
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

    @Test
    public void isDivisibleByFifteen(){
        assertTrue(fizzbuzz.isDivisibleByFifteen(15));
    }

    @Test
    public void isNotDivisibleByFifteen(){
        assertFalse(fizzbuzz.isDivisibleByFifteen(1));
    }

    @Test
    public void shoutFizz(){
        assertEquals("Fizz", fizzbuzz.shout(3));
    }

    @Test
    public void shoutBuzz(){
        assertEquals("Buzz", fizzbuzz.shout(5));
    }

    @Test
    public void shoutFizzBuzz(){
        assertEquals("FizzBuzz", fizzbuzz.shout(15));
    }
}