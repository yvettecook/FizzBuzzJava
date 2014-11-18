import org.junit.Test;

import static junit.framework.Assert.assertTrue;


public class FizzBuzzTest {

    @Test
    public void
        isDivisibleByThree() {
            FizzBuzz fizzbuzz = new FizzBuzz();
            assertTrue(fizzbuzz.isDivisibleByThree(3));
    }

}