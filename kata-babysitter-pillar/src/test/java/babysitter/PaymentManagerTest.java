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
	
	@Test
	public void paymentManagerCalculateCorrectPayWithoutBedTime() {
		Family myFamily = new Family("A");
		PaymentManager myPaymentManager = new PaymentManager(17, 26,myFamily);
		assertEquals(150, myPaymentManager.calculatePay());
	}
	
	@Test
	public void paymentManagerCalculateCorrectPayWithBedTime() {
		Family myFamily = new Family("B");
		PaymentManager myPaymentManager = new PaymentManager(19, 27,myFamily);
		assertEquals(100, myPaymentManager.calculatePay());
	}

}
