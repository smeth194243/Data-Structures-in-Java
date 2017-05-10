package ds.controller;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import ds.model.*;

public class DSController
{
	private Queue<Customer> customerQueue;
	private Stack<String> stackOfStrings;
	
	public DSController()
	{
		customerQueue = new LinkedList<Customer>();
		stackOfStrings = new Stack<String>();
	}
	
	
	public void start()
	{
		Customer Isaac = new Customer("Isaac");
		Customer Jacob = new Customer("Jacob");
		Customer Tyler = new Customer("Tyler");
		
		customerQueue.add(Isaac);
		customerQueue.add(Jacob);
		customerQueue.add(Tyler);
		
		customerQueue.remove();
		System.out.println(customerQueue.peek());
		
		String stringVariable = "This is a string that contains words.";
		String variableString = "This is also a String that also contains words.";
		
		stackOfStrings.push(stringVariable);
		stackOfStrings.push(variableString);
		
		stackOfStrings.pop();
		
		System.out.println(stackOfStrings.peek());
	}
}
