package ex3;

import org.junit.Test;

import org.junit.Assert;

public class LeapYearVerifatorShould {

	@Test
	public void verify_that_a_leap_year_is_divisible_by_4(){
		MyYear myYear = new MyYear(1992);
		Assert.assertTrue(myYear.verify_is_leap());
		
	}
	
	@Test
	public void verify_that_a_year_is_not_a_leap_year_if_it_is_not_divisible_by_4(){
		MyYear myYear = new MyYear(1993);
		Assert.assertFalse(myYear.verify_is_leap());
		
	}
	
	@Test
	public void verify_that_a_leap_year_is_divisible_by_100_and_400()
	{
		MyYear myYear = new MyYear(2000);
		Assert.assertTrue(myYear.verify_is_leap());
	}
	
	@Test
	public void verify_that_a_year_is_NOT_a_leap_year_if_it_is_divisible_by_100_but_not_by_400()
	{
		MyYear myYear = new MyYear(1900);
		Assert.assertFalse(myYear.verify_is_leap());
	}
	
}
