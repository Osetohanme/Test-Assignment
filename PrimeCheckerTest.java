import static org.junit.Assert.*;
public class PrimeCheckerTest {
    public static void main(String[] args) {
        PrimeChecker checker = new PrimeChecker();

        // Test cases
        testIsPrime(checker, 2, true);
        testIsPrime(checker, 4, false);
        testIsPrime(checker, 17, true);
        testIsPrime(checker, 20, false);
        testIsPrime(checker, 97, true);
        testIsPrime(checker, 1, false);
        testIsPrime(checker, -5, false);
        testIsPrime(checker, 0, false);
    }

    // Helper method to run individual test cases
    private static void testIsPrime(PrimeChecker checker, int number, boolean expected) {
        boolean result = checker.isPrime(number);
        if (result == expected) {
            System.out.println("Test passed for " + number + ": " + result);
        } else {
            System.out.println("Test failed for " + number + ": expected " + expected + " but got " + result);
        }
    }
}
