package babysitter;

import static org.junit.Assert.*;

import org.junit.Test;

public class BabySitterTest {
	
	@Test
	public void babySitterReturnsStartTimeAs17() {
		BabySitter myBabySitter = new BabySitter();
		assertEquals(17, myBabySitter.getiStartTime()); 
	}

}
