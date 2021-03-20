import org.junit.Assert;
import org.junit.Test;

public class StringServiceTest {
    String s1 = "613131384316";
    String s2 = "jbbsjlvjvblk";
    String s3 = "";
    String s4 = "12345";
    String s5 = "12321";
    String s6 = "1,2,3,4,5";
    String s7 = "***sd*ds**s*d***fs*fs****";
    String s8 = "а роза упала на лапу Азора";
    String s9 = "а";



    StringService stringService = new StringService();
    @Test
    public void isPalindromeTest1() {
        boolean actual = stringService.isPalindrome(s8);
        Assert.assertTrue(actual);
    }
    @Test
    public void isPalindromeTest2() {
        boolean actual = stringService.isPalindrome(s9);
        Assert.assertTrue(actual);
    }
    @Test
    public void isPalindromeTest3() {
        boolean actual = stringService.isPalindrome(s3);
        Assert.assertTrue(actual);
    }
    @Test
    public void isPalindromeTest4() {
        boolean actual = stringService.isPalindrome(s4);
        Assert.assertFalse(actual);
    }


    @Test
    public void charRepeatTest1() {
        int actual = stringService.charRepeat(s1, '1');
        Assert.assertEquals(4, actual);
    }
    @Test
    public void charRepeatTest2() {
        int actual = stringService.charRepeat(s2, '1');
        Assert.assertEquals(0, actual);
    }
    @Test
    public void charRepeatTest3() {
        int actual = stringService.charRepeat(s3, '1');
        Assert.assertEquals(0, actual);
    }

    @Test
    public void expandStringTest1() {
        String actual = stringService.expandString(s4);
        Assert.assertEquals("54321", actual);
    }
    @Test
    public void expandStringTest2() {
        String actual = stringService.expandString(s3);
        Assert.assertEquals("", actual);
    }
    @Test
    public void expandStringTest3() {
        String actual = stringService.expandString(s5);
        Assert.assertEquals("12321", actual);
    }

    @Test
    public void stringInStringArrayTest1() {
        String [] expected = {"1","2","3","4"};
        String [] actual = stringService.stringInStringArray(s6, ',');
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void stringInStringArrayTest2() {
        String [] expected = {};
        String [] actual = stringService.stringInStringArray(s3, ',');
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void stringInStringArrayTest3() {
        String [] expected = {};
        String [] actual = stringService.stringInStringArray(s6, '.');
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void stringInStringArrayTest4() {
        String [] expected = {"sd","ds","s","d","fs","fs"};
        String [] actual = stringService.stringInStringArray(s7, '*');
        Assert.assertArrayEquals(expected, actual);
    }
}
