package babysitter;

import static org.junit.Assert.*;
import org.junit.Test;

import exception.ExceptionMessage;;


public class BabySitterTest {

	
	@Test
	public void babySitterReturnsStartTimeAs17() {
		BabySitter myBabySitter = new BabySitter();
		assertEquals(17, myBabySitter.getiStartTime()); 
	}
	
	@Test
	public void babySitterAcceptParamStartTimeAndReturnIt() {
		BabySitter myBabySitter = new BabySitter(23,28,"A");
		assertEquals(23	, myBabySitter.getiStartTime());
	}
	
	@Test
	public void babySitterReturnsEndTimeAs28() {
		BabySitter myBabySitter = new BabySitter();
		assertEquals(28, myBabySitter.getiEndTime());
	}
	
	@Test
	public void babySitterAcceptParamEndTimeAndReturnIt() {
		BabySitter myBabySitter = new BabySitter(23,26,"A");
		assertEquals(26, myBabySitter.getiEndTime());
	}
	
    @Test
    public void babySitterCheckStartTimeAndThrowsExceptionWithMessage() {
        try {
            new BabySitter(3, 20,"A");
        } catch (ExceptionMessage ex) {
            assertEquals(BabySitter.START_TIME_ERROR_MESSAGE, ex.getMessage());
        }
    }
    
    @Test
    public void babySitterCheckEndTimeAndThrowsExceptionWithMessage() {
        try {
            new BabySitter(17, 30,"A");
        } catch (ExceptionMessage ex) {
            assertEquals(BabySitter.START_TIME_ERROR_MESSAGE, ex.getMessage());
        }
    }
    
    @Test
    public void babySitterAcceptParamFamily() {
    	BabySitter myBabySitter = new BabySitter(17, 23, "B");
    	assertEquals("B", myBabySitter.getMyFamily().getsName());
    }
    

}
