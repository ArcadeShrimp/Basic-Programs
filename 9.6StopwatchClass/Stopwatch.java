import java.util.Date;
public class Stopwatch {
	private  long startTime;
	private  long endTime;
	
	Stopwatch(){
		
	}
	public void startTime(){
		startTime=System.currentTimeMillis();
	}
	public void endTime(){
		endTime=System.currentTimeMillis();
	}
	public long getElapsedTime(){
		 
		return endTime - startTime;
	}
	public long getStartTime(){
		return startTime;
	}
	public long getEndTime(){
		return endTime;
	}
}
