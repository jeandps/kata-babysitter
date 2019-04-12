package babysitter;

import exception.ExceptionMessage;
import family.Family;

public class BabySitter {
	
	public static final String START_TIME_ERROR_MESSAGE = "I can't start earlier than 5:00PM";
	public static final String END_TIME_ERROR_MESSAGE = "I can't leave later than 4:00AM";
	
	public static final int EARLIEST_START = 17;
	public static final int MAXIMUM_END = 28;
	
	private int iStartTime;
	private int iEndTime;
	
	private Family myFamily;
	private PaymentManager myPaymentManager;

	public BabySitter() {
		this.setiStartTime(EARLIEST_START);
		this.setiEndTime(MAXIMUM_END);
		this.setMyFamily(new Family("A"));
		this.setMyPaymentManager(new PaymentManager(EARLIEST_START, MAXIMUM_END, this.myFamily));
	}
	
	public BabySitter(int iStartTime, int iEndTime,String sFamilyName) {
		this.setiStartTime(iStartTime);
		this.setiEndTime(iEndTime);
		this.validateBabySittingTime(this.iStartTime, this.iEndTime);
		this.setMyFamily(new Family(sFamilyName));
		this.setMyPaymentManager(new PaymentManager(this.iStartTime, this.iEndTime, this.myFamily));
		
	}
	
    private void validateBabySittingTime(int iStartTime, int iEndTime) {
        if (iStartTime < EARLIEST_START && iStartTime > MAXIMUM_END) {
            throw new ExceptionMessage(START_TIME_ERROR_MESSAGE);
        } else if (iEndTime < EARLIEST_START && iEndTime > MAXIMUM_END) {
            throw new ExceptionMessage(END_TIME_ERROR_MESSAGE);
        }
    }
    
    public int calculatePay() {
        return this.myPaymentManager.calculatePay();
    }

	public int getiStartTime() {
		return iStartTime;
	}

	public void setiStartTime(int iStartTime) {
		this.iStartTime = iStartTime;
	}
	
	public int getiEndTime() {
		return iEndTime;
	}

	public void setiEndTime(int iEndTime) {
		this.iEndTime = iEndTime;
	}

	public Family getMyFamily() {
		return myFamily;
	}

	public void setMyFamily(Family myFamily) {
		this.myFamily = myFamily;
	}

	public PaymentManager getMyPaymentManager() {
		return myPaymentManager;
	}

	public void setMyPaymentManager(PaymentManager myPaymentManager) {
		this.myPaymentManager = myPaymentManager;
	}


}
