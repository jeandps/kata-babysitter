package babysitter;

public class BabySitter {
	
	private int iStartTime;
	
	public BabySitter() {
		setiStartTime(17);
	}
	
	public BabySitter(int iStartTime) {
		setiStartTime(iStartTime);
	}

	public int getiStartTime() {
		return iStartTime;
	}

	public void setiStartTime(int iStartTime) {
		this.iStartTime = iStartTime;
	}

}
