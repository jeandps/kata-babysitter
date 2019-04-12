package family;

import exception.ExceptionMessage;

public class Family {
	
	public static final String NAME_ERROR_MESSAGE = "This family is unknown.";
	
	private String sName;
	private int iRateBeforeBedTime;
	private int iRateAfterBedAndBeforeMidnight;
	private int iRateRestOfNight;
	private int iBedTime;
	
	public Family(String sFamilyName) {
		
		this.setsName(sFamilyName);
		
		if (this.getsName().equals("A")) {

			this.setiBedTime(23);
			this.setiRateBeforeBedTime(15);
			this.setiRateAfterBedAndBeforeMidnight(0);
			this.setiRateRestOfNight(20);	
			
		}else if (this.getsName().equals("B")) {
			
			this.setiBedTime(22);
			this.setiRateBeforeBedTime(12);
			this.setiRateAfterBedAndBeforeMidnight(8);
			this.setiRateRestOfNight(16);	
			
		}else if (this.getsName().equals("C")) {

			this.setiBedTime(21);
			this.setiRateBeforeBedTime(21);
			this.setiRateAfterBedAndBeforeMidnight(0);
			this.setiRateRestOfNight(15);	
			
		}else {
			throw new ExceptionMessage(NAME_ERROR_MESSAGE);
		}
		
			
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getiRateBeforeBedTime() {
		return iRateBeforeBedTime;
	}

	public void setiRateBeforeBedTime(int iRateBeforeBedTime) {
		this.iRateBeforeBedTime = iRateBeforeBedTime;
	}

	public int getiRateAfterBedAndBeforeMidnight() {
		return iRateAfterBedAndBeforeMidnight;
	}

	public void setiRateAfterBedAndBeforeMidnight(int iRateAfterBedAndBeforeMidnight) {
		this.iRateAfterBedAndBeforeMidnight = iRateAfterBedAndBeforeMidnight;
	}

	public int getiRateRestOfNight() {
		return iRateRestOfNight;
	}

	public void setiRateRestOfNight(int iRateRestOfNight) {
		this.iRateRestOfNight = iRateRestOfNight;
	}

	public int getiBedTime() {
		return iBedTime;
	}

	public void setiBedTime(int iBedTime) {
		this.iBedTime = iBedTime;
	}

}
