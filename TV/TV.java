
public class TV {
	int channel;
	int volumeLevel;
	boolean on;
	TV(){
		int channel=1;
		int volumeLevel=12;
		boolean on = false;
	}
	public void turnOn(){
		on=true;
	}
	public void turnOff(){
		on=false;
	}
	public void setChannel(int newChannel){
		channel=newChannel;
	}
	public void volumeUp(int amount){
		volumeLevel=+amount;
		if(volumeLevel>50)
			volumeLevel=50;
	}
	public void volumeDown(int amount){
		volumeLevel-=amount;
		if(volumeLevel<0)
			volumeLevel=0;
	}
	public void channelUp(){
		channel+=1;
		if(channel>120)
			channel=1;
		if(channel<1)
			channel=120;
	}
	public void channelDown(){
		channel-=1;
		if(channel>120)
			channel=1;
		if(channel<1)
			channel=120;
	}
	public void setVolume(int vol){
		volumeLevel=vol;
		if(volumeLevel<0)
			volumeLevel=0;
		if(volumeLevel>50)
			volumeLevel=50;
	}
	public int getChannel(){
		return channel;
	}
}
