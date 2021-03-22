import org.junit.Assert;
import org.junit.Test;

public class StringInStringArrayTest extends StringServiceTest {

    @Test
    public void stringInStringArrayTest1() {
        String [] expected = {"1","2","3","4"};
        String [] actual = stringService.stringInStringArray("1,2,3,4,5", ',');
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void stringInStringArrayTest2() {
        String [] expected = {};
        String [] actual = stringService.stringInStringArray("", ',');
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void stringInStringArrayTest3() {
        String [] expected = {};
        String [] actual = stringService.stringInStringArray("1,2,3,4,5", '.');
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void stringInStringArrayTest4() {
        String [] expected = {"sd","ds","s","d","fs","fs"};
        String [] actual = stringService.stringInStringArray("***sd*ds**s*d***fs*fs****", '*');
        Assert.assertArrayEquals(expected, actual);
    }
}
