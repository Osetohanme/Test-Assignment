import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeCheckerTest {

    // Testing the isPalindrome method
    @Test
    public void testIsPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("level")); 
        assertTrue(PalindromeChecker.isPalindrome("rotor"));
        assertTrue(PalindromeChecker.isPalindrome("madam"));
        assertFalse(PalindromeChecker.isPalindrome("tree"));
        assertFalse(PalindromeChecker.isPalindrome("bucket"));
        assertTrue(PalindromeChecker.isPalindrome(""));
        assertTrue(PalindromeChecker.isPalindrome("   "));
    }
}