import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeCheckerTest {

    @Test
    public void testIsPrime() {
        assertTrue(PrimeChecker.isPrime(2));
        assertTrue(PrimeChecker.isPrime(3));
        assertTrue(PrimeChecker.isPrime(5));
        assertTrue(PrimeChecker.isPrime(7));
        assertFalse(PrimeChecker.isPrime(1));
        assertFalse(PrimeChecker.isPrime(4));
        assertFalse(PrimeChecker.isPrime(9));
        assertFalse(PrimeChecker.isPrime(10));
        assertTrue(PrimeChecker.isPrime(11));
        assertFalse(PrimeChecker.isPrime(-7));
    }

    @Test
    public void testIsPrimeLargeNumbers() {
        assertTrue(PrimeChecker.isPrime(7919));
    }
}