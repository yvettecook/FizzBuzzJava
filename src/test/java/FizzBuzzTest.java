import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertFalse;


public class FizzBuzzTest {

    @Test
    public void
        isDivisibleByThree() {
            FizzBuzz fizzbuzz = new FizzBuzz();
            assertTrue(fizzbuzz.isDivisibleByThree(3));
    }

    @Test
    public void
        isNotDivisibleByThree() {
            FizzBuzz fizzbuzz = new FizzBuzz();
            assertFalse(fizzbuzz.isDivisibleByThree(1));
    }

    @Test
    public void
        isDivisibleByFive() {
            FizzBuzz fizzbuzz = new FizzBuzz ();
            assertTrue(fizzbuzz.isDivisibleByFive(5));
    }

}