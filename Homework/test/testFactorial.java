import static org.junit.Assert.*;

import org.junit.Test;

import tugodum.Factorial;

public class testFactorial {

	@Test
	public void getFactorial() {
		Factorial myControl = new Factorial();
		  int runControl = myControl.getFactorial(5);
		  assertEquals(120, runControl);
		  
		
	}

}
