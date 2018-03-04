package myAlgos;

import org.junit.Assert;
import org.junit.Test;

public class IsAnagramTest {

    @Test
    public void isAnagram1() {
    }

    @Test
    public void isAnagramTest1() {
        Assert.assertEquals(IsAnagram.isAnagram("abc", "bca"), true);
    }

    @Test
    public void isAnagramTest2() {
        Assert.assertNotEquals(IsAnagram.isAnagram("abca", "abc"), true);
    }
}
