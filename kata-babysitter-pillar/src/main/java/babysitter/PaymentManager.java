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
	
	public int calculatePay() {
		if (this.myFamily.getiRateAfterBedAndBeforeMidnight()==0) {
			return this.getHoursBeforeBedTime() * this.myFamily.getiRateBeforeBedTime()
					+ this.getHoursAfterBedAndBeforeMidnight() * this.myFamily.getiRateRestOfNight()
					+ this.getHoursRestOfTheNight() * this.myFamily.getiRateRestOfNight();
		}else {
			return this.getHoursBeforeBedTime() * this.myFamily.getiRateBeforeBedTime()
					+ this.getHoursAfterBedAndBeforeMidnight() * this.myFamily.getiRateAfterBedAndBeforeMidnight()
					+ this.getHoursRestOfTheNight() * this.myFamily.getiRateRestOfNight();
		}
	}
	
	private int getHoursBeforeBedTime() {
        if (this.iEndTime < this.myFamily.getiBedTime()) {
            return this.iEndTime - this.iStartTime;
        }
        return this.myFamily.getiBedTime() - this.iStartTime;
	}
	
	private int getHoursAfterBedAndBeforeMidnight() {
        if (this.iEndTime < this.myFamily.getiBedTime()) {
            return 0;
        }
        if (this.iEndTime < 24) {
            return this.iEndTime - this.myFamily.getiBedTime();
        }
        return 24 - this.myFamily.getiBedTime();
	}
	
	private int getHoursRestOfTheNight() {
        if (this.iEndTime <= 24) {
            return 0;
        }
        return this.iEndTime - 24;
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
