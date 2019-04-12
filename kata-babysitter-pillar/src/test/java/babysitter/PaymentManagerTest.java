package babysitter;

import static org.junit.Assert.*;
import org.junit.Test;

public class PaymentManagerTest {
	
	@Test
	public void paymentManagerAcceptsParamStartTimeBedTimeAndFamily() {
		PaymentManager myPaymentManager = new PaymentManager(17, 26, "A");
		assertEquals(17, myPaymentManager.getiStartTime());
		assertEquals(26, myPaymentManager.getiEndTime());
		assertEquals("A", myPaymentManager.getsFamily());
		
	}

}
