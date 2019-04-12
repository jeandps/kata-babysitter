package babysitter;

import family.Family;

public class PaymentManager {
	
	private int iStartTime;
	private int iEndTime;
	private Family myFamily;
	
	public PaymentManager(int iStartTime, int iEndTime,Family myFamily) {
		setiStartTime(iStartTime);
		setiEndTime(iEndTime);
		setMyFamily(myFamily);
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


}
