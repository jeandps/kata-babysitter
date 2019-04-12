package babysitter;

import static org.junit.Assert.*;

import org.junit.Test;

public class BabySitterTest {

	
	@Test
	public void babySitterReturnsStartTimeAs17() {
		BabySitter myBabySitter = new BabySitter();
		assertEquals(17, myBabySitter.getiStartTime()); 
	}
	
	@Test
	public void babySitterAcceptParamStartTimeAndReturnIt() {
		BabySitter myBabySitter = new BabySitter(23,28);
		assertEquals(23	, myBabySitter.getiStartTime());
	}
	
	@Test
	public void babySitterReturnsEndTimeAs28() {
		BabySitter myBabySitter = new BabySitter();
		assertEquals(28, myBabySitter.getiEndTime());
	}
	
	@Test
	public void babySitterAcceptParamEndTimeAndReturnIt() {
		BabySitter myBabySitter = new BabySitter(23,26);
		assertEquals(26, myBabySitter.getiEndTime());
	}

}
