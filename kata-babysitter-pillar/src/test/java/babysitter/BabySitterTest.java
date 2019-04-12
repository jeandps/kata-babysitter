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
	
    @Test
    public void babySitterCheckStartTimeAndThrowsExceptionWithMessage() {
        try {
            new BabySitter(3, 20);
        } catch (ExceptionMessage ex) {
            assertEquals(BabySitter.START_TIME_ERROR_MESSAGE, ex.getMessage());
        }
    }
    
    @Test
    public void babySitterCheckEndTimeAndThrowsExceptionWithMessage() {
        try {
            new BabySitter(17, 30);
        } catch (ExceptionMessage ex) {
            assertEquals(BabySitter.START_TIME_ERROR_MESSAGE, ex.getMessage());
        }
    }

}
