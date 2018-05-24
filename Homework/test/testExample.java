import static org.junit.Assert.*;

import org.junit.Test;

import tugodum.Example;

public class testExample {

	@Test
	public void getExample() {
		Example myControl = new Example();
		     int runControl = myControl.getExample(5);
		       assertEquals(720, runControl );
		    
		
	}

}
