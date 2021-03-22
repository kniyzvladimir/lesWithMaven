import org.junit.Assert;
import org.junit.Test;

public class ExpandStringTest extends StringServiceTest {
    @Test
    public void expandStringTest1() {
        String actual = stringService.expandString("12345");
        Assert.assertEquals("54321", actual);
    }
    @Test
    public void expandStringTest2() {
        String actual = stringService.expandString("");
        Assert.assertEquals("", actual);
    }
    @Test
    public void expandStringTest3() {
        String actual = stringService.expandString("12321");
        Assert.assertEquals("12321", actual);
    }
}
