package ex1;

import java.util.ArrayList;

public class Stack {

	private ArrayList<Object> stackList;
	
	public Stack()
	{
		stackList= new ArrayList<Object> ();
	}
	
	public Stack(ArrayList<Object> stackList)
	{
		this.stackList = stackList;
	}
	
	public void push(Object object)
	{
		stackList.add(object);
	}
	
	public Object pop() throws Exception {
		if(stackList.isEmpty())
		{
			throw new Exception();
		}else
		{
			return stackList.remove(stackList.size()-1);
		}
	}
	
	public ArrayList<Object> getStackList() {
		return stackList;
	}	
}
