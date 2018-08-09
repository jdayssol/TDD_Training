package ex1;

import org.junit.Assert;
import org.junit.Test;

public class StackShould {

	Stack stack = new Stack();
	
	@Test
	public void push_a_object()
	{
		stack.push("T");
		Assert.assertEquals(stack.getStackList().size(),1);
	}
	
	@Test
	public void pop_the_object_that_we_push_before() throws Exception
	{
		stack.push("T");
		Assert.assertEquals("T",stack.pop().toString());
	}
	
	@Test(expected=Exception.class)
	public void pop_a_exception_when_empty() throws Exception
	{
		stack.pop();
	}
	
	@Test
	public void push_and_pop_multiple_object() throws Exception
	{
		stack.push("A");
		stack.push("B");
		stack.push("C");
		Assert.assertEquals("C",stack.pop());
		Assert.assertEquals("B",stack.pop());
		stack.push("D");
		Assert.assertEquals("D",stack.pop());
		Assert.assertEquals("A",stack.pop());
		
	}
}
