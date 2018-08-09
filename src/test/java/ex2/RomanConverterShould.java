package ex2;

import org.junit.Assert;
import org.junit.Test;


public class RomanConverterShould {

	RomanConverter roman = new RomanConverter();
	
	@Test
	public void convert_1_toI() {
		Assert.assertEquals("I", roman.convert(1));
	}

	@Test
	public void convert4_toIV() {
		Assert.assertEquals("IV", roman.convert(4));
	}
	
	@Test
	public void convert5_to_V() {
		Assert.assertEquals("V", roman.convert(5));
	}
	
	@Test
	public void convert9_to_IX() {	
		Assert.assertEquals("IX", roman.convert(9));
	}
	
	@Test
	public void convert10_to_X() {
		Assert.assertEquals("X", roman.convert(10));
	}
	
	@Test
	public void convert50_to_L() {
		Assert.assertEquals("L", roman.convert(50));
	}
	
	@Test
	public void convert100_to_C() {
		Assert.assertEquals("C", roman.convert(100));
	}
	
	@Test
	public void convert400_to_CD() {
		Assert.assertEquals("CD", roman.convert(400));
	}
	
	@Test
	public void convert500_to_C() {
		Assert.assertEquals("D", roman.convert(500));
	}

	@Test
	public void convert1000_to_M() {
		Assert.assertEquals("M", roman.convert(1000));
	}
	
	@Test
	public void convert2499_to_MMCDXCIX() {
		Assert.assertEquals("MMCDXCIX", roman.convert(2499));
	}
	
	@Test
	public void convert3949_to_MMMCMXLIX() {
		Assert.assertEquals("MMMCMXLIX", roman.convert(3949));
	}
	
}
