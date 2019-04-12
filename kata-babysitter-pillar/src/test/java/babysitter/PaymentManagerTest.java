package babysitter;

import static org.junit.Assert.*;
import org.junit.Test;

import family.Family;

public class PaymentManagerTest {
	
	@Test
	public void paymentManagerAcceptsParamStartTimeBedTimeAndFamily() {
		Family myFamily = new Family("A");
		PaymentManager myPaymentManager = new PaymentManager(17, 26,myFamily);
		assertEquals(17, myPaymentManager.getiStartTime());
		assertEquals(26, myPaymentManager.getiEndTime());
		
	}

}
