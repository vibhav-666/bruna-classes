package step_definitions;
/*
 * Small class to practice writing JUnit tests 
 * Author: Renata Rand McFadden, PhD
 * Version 1
 */


public class MultiFunctionPrinter {

	  // printer functions
	
	// attributes
	private Function currentFunc;   // current function setting can only be PRINT, COPY, SCAN
	private int pages;  			// number of pages for print or copy
	
	// default constructor sets default function to PRINT
	public MultiFunctionPrinter()
	{
		currentFunc = Function.PRINT; // default function is printer
	}
	
	// get methods
	public Function getFunction()
	{
		return currentFunc;
	}
	
	public int getPages()
	{
		return pages;
	}
	
	// change the function to the given parameter
	// throw IllegalArgumentException if not PRINT, COPY, SCAN
	//     and issue message "Parameter can only be PRINT, COPY, or SCAN"
	public void setFunction(Function f)
	{
		if (f != Function.PRINT && f != Function.SCAN)
		{
			throw new IllegalArgumentException("Illegal parameter");
		}
		currentFunc = f;
	}
	
	// set the number of pages to the parameter
	// if the current function is not PRINT or COPY, set to 0
	// if parameter is less than 0 set to 0
	public void setPages(int p)
	{
		if (p < 0)
			pages= 0;
		else
			pages= p;
	}
	
	// change function and pages to parameter value
	// if function does not equal PRINT or COPY, throw IllegalArgumentException
	//    and message "Function can only be PRINT or COPY"
	public void settings(Function f, int p)
	{
		if (f != Function.COPY || f != Function.PRINT)
		{
			throw new IllegalArgumentException("Function can only be PRINT or COPY");
		}
		currentFunc = f;
		pages= p;
	}
}
