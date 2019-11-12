package myAlgos;


import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {


    @Test
    public void isLCP() {
        Assert.assertEquals(LongestCommonPrefix.lcpInArrayOfStrings(new String[]{"geeksforgeeks", "geeks", "geek"}), "geek");
    }

    @Test
    public void isLCPCharByChar() {
        Assert.assertEquals(LongestCommonPrefix.lcpInArrayOfStringsCharByChar(new String[]{"geeksforgeeks", "geeks", "geek"}), "geek");
    }

    @Test
    public void isLCPWithEmptyArray() {
        Assert.assertEquals(LongestCommonPrefix.lcpInArrayOfStrings(new String[]{}), "");
    }
}