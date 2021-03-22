import org.junit.Assert;
import org.junit.Test;

public class CharRepeatTest extends StringServiceTest {

    @Test
    public void charRepeatTest1() {
        int actual = stringService.charRepeat("613131384316", '1');
        Assert.assertEquals(4, actual);
    }
    @Test
    public void charRepeatTest2() {
        int actual = stringService.charRepeat("jbbsjlvjvblk", '1');
        Assert.assertEquals(0, actual);
    }
    @Test
    public void charRepeatTest3() {
        int actual = stringService.charRepeat("", '1');
        Assert.assertEquals(0, actual);
    }
}
