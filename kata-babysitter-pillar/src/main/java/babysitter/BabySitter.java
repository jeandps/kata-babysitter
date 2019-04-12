package babysitter;

import exception.ExceptionMessage;

public class BabySitter {
	
	public static final String START_TIME_ERROR_MESSAGE = "I can't start earlier than 5:00PM";
	public static final String END_TIME_ERROR_MESSAGE = "I can't leave later than 4:00AM";
	
	public static final int EARLIEST_START = 17;
	public static final int MAXIMUM_END = 28;
	public static final int BED_TIME_DEFAULT = 20;
	
	private int iStartTime;
	private int iEndTime;
	private int iBedTime;

	public BabySitter() {
		setiStartTime(EARLIEST_START);
		setiEndTime(MAXIMUM_END);
		setiBedTime(BED_TIME_DEFAULT);
	}
	
	public BabySitter(int iStartTime, int iEndTime, int iBedTime) {
		this.setiStartTime(iStartTime);
		this.setiEndTime(iEndTime);
		this.setiBedTime(iBedTime);
		this.validateBabySittingTime(this.iStartTime, this.iEndTime);
	}
	
    private void validateBabySittingTime(int iStartTime, int iEndTime) {
        if (iStartTime < EARLIEST_START && iStartTime > MAXIMUM_END) {
            throw new ExceptionMessage(START_TIME_ERROR_MESSAGE);
        } else if (iEndTime < EARLIEST_START && iEndTime > MAXIMUM_END) {
            throw new ExceptionMessage(END_TIME_ERROR_MESSAGE);
        }
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

	public int getiBedTime() {
		return iBedTime;
	}

	public void setiBedTime(int iBedTime) {
		this.iBedTime = iBedTime;
	}

}
