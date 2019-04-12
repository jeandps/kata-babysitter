package babysitter;

public class PaymentManager {
	
	private int iStartTime;
	private int iEndTime;
	private String sFamily;
	
	public PaymentManager(int iStartTime, int iEndTime, String sFamily) {
		setiStartTime(iStartTime);
		setiEndTime(iEndTime);
		setsFamily(sFamily);
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

	public String getsFamily() {
		return sFamily;
	}

	public void setsFamily(String sFamily) {
		this.sFamily = sFamily;
	}

}
