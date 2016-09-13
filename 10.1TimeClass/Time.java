import java.util.Date;
import java.util.Calendar;

public class Time {
	public int hour = Calendar.HOUR_OF_DAY;
	public int minute = Calendar.MINUTE;
	public int second = Calendar.SECOND;

	public Time() {
		Calendar cal = Calendar.getInstance();
		hour = cal.get(Calendar.HOUR_OF_DAY);
		second = cal.get(Calendar.SECOND);
		minute = cal.get(Calendar.MINUTE);
	}

	public Time(long time) {
		long timeInSec = time / 1000;

		second = (int) timeInSec % 60;
		minute = ((int) timeInSec / 60) % 60;
		hour = ((int) timeInSec / 3600) % 24;
	}

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void setTime(long elapseTime) {
		long timeInSec = elapseTime / 1000;

		second = (int) timeInSec % 60;
		minute = ((int) timeInSec / 60) % 60;
		hour = ((int) timeInSec / 3600) % 24;
	}

	public String toString() {
		return hour + ": " + minute + ": " + second;
	}
}
