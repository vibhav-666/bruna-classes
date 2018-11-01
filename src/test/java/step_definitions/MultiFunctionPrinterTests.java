package step_definitions;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;



public class MultiFunctionPrinterTests {
	
	
	private static final Function PRINT = null;
	MultiFunctionPrinter p;
	

	ArrayList<String> listOfValidStrings = new ArrayList();

	@Before
	    public void setData(){
			p =new MultiFunctionPrinter();
	}

	@Test
	public void testPrint() {
		p.setFunction(Function.PRINT);
		assertEquals(Function.PRINT,p.getFunction());
			
	}
	@Test
	public void testScan() {
		p.setFunction(Function.SCAN);
		assertEquals(Function.SCAN,p.getFunction());
			
	}
	@Test
	public void testException() {
		try {
		p.setFunction(Function.TEST);
		fail();
		}
		catch(Exception e) {
		 assertEquals("Illegal parameter",e.getMessage());
		}	
	}
	@Test
	public void testZeroPage() {
		p.setPages(0);
		assertEquals(0,p.getPages());
			
	}
	@Test
	public void testLessZeroPage() {
		p.setPages(-1);
		assertEquals(0,p.getPages());
			
	}
	@Test
	public void testPages() {
		p.setPages(10);
		assertEquals(10,p.getPages());
			
	}
	

	@Test
	public void testsettings_4() {
		try{			
				p.settings(Function.COPY, 5);	
		}
		catch(Exception e)
		{	
			fail();
		}
	}

@Test
	public void testsettings_3() {
		try{
				p.settings(Function.PRINT, 5);	
		}
		catch(Exception e)
		{	
			fail();
		}
	}
@Test
	public void testsettings_2() {
		try{
			
				p.settings(Function.FAX, 5);
				fail();
		}
		catch(Exception e)
		{
			
			assertEquals("Function can only be PRINT or COPY" , e.getMessage());
		}
	}
@Test
	public void testsettings_1() {
		try{
				p.settings(Function.SCAN, 5);
				fail();
		}
		catch(Exception e)
		{
			assertEquals("Function can only be PRINT or COPY" , e.getMessage());
		}
	}
	
	
	

}
