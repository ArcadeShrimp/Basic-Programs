
public class ClientTV {
	public static void main(String [] args){
		TV tv1=new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(30);
		
		TV tv2 =new TV();
		tv2.turnOn();
		tv2.setChannel(119);
		tv2.setVolume(999);
		
		System.out.println("tv1's channel is: "+ tv1.channel +"\nand the volume is: "+tv1.volumeLevel);
		System.out.println("tv1's channel is: "+ tv1.getChannel() +"\nand the volume is: "+tv1.volumeLevel);
		System.out.println("tv2's channel is: "+ tv2.channel +"\nand the volume is: "+tv2.volumeLevel);
	}
}




// Class objectRef = new Class();