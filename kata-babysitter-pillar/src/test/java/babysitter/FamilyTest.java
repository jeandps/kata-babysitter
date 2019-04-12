package babysitter;

import static org.junit.Assert.*;
import org.junit.Test;

import family.Family;

public class FamilyTest {
	
	@Test
	public void familyAcceptParamName() {
		Family myFamily = new Family("A");
		assertEquals("A", myFamily.getsName());
	}
	
	@Test
	public void familyReturnsCorrectRates() {
		Family myFamily = new Family("B");
		assertEquals(12, myFamily.getiRateBeforeBedTime());
		assertEquals(8, myFamily.getiRateAfterBedAndBeforeMidnight());
		assertEquals(16, myFamily.getiRateRestOfNight());
	}

}
