import org.junit.Assert;
import org.junit.Test;

public class StringServicePalindromeTest extends StringServiceTest {
    @Test
    public void isPalindromeTest1() {
        boolean actual = stringService.isPalindrome("а роза упала на лапу Азора");
        Assert.assertTrue(actual);
    }
    @Test
    public void isPalindromeTest2() {
        boolean actual = stringService.isPalindrome("а");
        Assert.assertTrue(actual);
    }
    @Test
    public void isPalindromeTest3() {
        boolean actual = stringService.isPalindrome("");
        Assert.assertTrue(actual);
    }
    @Test
    public void isPalindromeTest4() {
        boolean actual = stringService.isPalindrome("12345");
        Assert.assertFalse(actual);
    }
}
