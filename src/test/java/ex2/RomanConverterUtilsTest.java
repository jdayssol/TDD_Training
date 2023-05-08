package ex2;

import org.junit.Assert;
import org.junit.Test;

public class RomanConverterUtilsTest {
    @Test
    public void testCaseFor1() {
        Assert.assertEquals("I", RomanConverterUtils.romanConverterUtils(1));
    }
    @Test
    public void testCaseFor2() {
        Assert.assertEquals("II", RomanConverterUtils.romanConverterUtils(2));
    }
    @Test
    public void testCaseFor4() {
        Assert.assertEquals("IV", RomanConverterUtils.romanConverterUtils(4));
    }
    @Test
    public void testCaseFor5() {
        Assert.assertEquals("V", RomanConverterUtils.romanConverterUtils(5));
    }
    @Test
    public void testCaseFor6() {
        Assert.assertEquals("VI", RomanConverterUtils.romanConverterUtils(6));
    }
    @Test
    public void testCaseFor8() {
        Assert.assertEquals("VIII", RomanConverterUtils.romanConverterUtils(8));
    }
    @Test
    public void testCaseFor10() {
        Assert.assertEquals("X", RomanConverterUtils.romanConverterUtils(10));
    }
    @Test
    public void testCaseFor1903() {
        Assert.assertEquals("MCMIII", RomanConverterUtils.romanConverterUtils(1903));
    }
    @Test
    public void testCaseFor899() {
        Assert.assertEquals("DCCCXCIX", RomanConverterUtils.romanConverterUtils(899));
    }
    @Test
    public void testCaseFor900() {
        Assert.assertEquals("CM", RomanConverterUtils.romanConverterUtils(900));
    }
    @Test
    public void testCaseFor3949() {
        Assert.assertEquals("MMMCMXLIX", RomanConverterUtils.romanConverterUtils(3949));
    }
    @Test
    public void testCaseFor100() {
        Assert.assertEquals("C", RomanConverterUtils.romanConverterUtils(100));
    }
    @Test
    public void testCaseFor2499() {
        Assert.assertEquals("MMCDXCIX", RomanConverterUtils.romanConverterUtils(2499));
    }
    @Test
    public void testCaseFor500() {
        Assert.assertEquals("D", RomanConverterUtils.romanConverterUtils(500));
    }
    @Test
    public void testCaseFor1000() {
        Assert.assertEquals("M", RomanConverterUtils.romanConverterUtils(1000));
    }
    @Test
    public void testCaseFor400() {
        Assert.assertEquals("CD", RomanConverterUtils.romanConverterUtils(400));
    }
    @Test
    public void testCaseFor50() {
        Assert.assertEquals("L", RomanConverterUtils.romanConverterUtils(50));
    }
}