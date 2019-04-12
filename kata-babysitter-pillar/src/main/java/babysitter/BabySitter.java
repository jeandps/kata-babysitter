package babysitter;

public class BabySitter {
	
	public static final int EARLIEST_START = 17;
	public static final int MAXIMUM_END = 28;
	
	private int iStartTime;
	private int iEndTime;

	public BabySitter() {
		setiStartTime(EARLIEST_START);
		setiEndTime(MAXIMUM_END);
	}
	
	public BabySitter(int iStartTime, int iEndTime) {
		setiStartTime(iStartTime);
		setiEndTime(iEndTime);
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

}
