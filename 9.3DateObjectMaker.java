import java.util.Date;
public class DateObjectMaker {
	public static void main(String[] args){
	Date[]array ={
	new Date(10000),
	new Date(100000),
	new Date(1000000),
	new Date(10000000),
	new Date(100000000),
	new Date(1000000000),
	new Date(10000000000L),
	new Date(100000000000L)
	};
	displayDates(array);
}
	public static void displayDates(Date[] array){
		for(int i =0;i<array.length;i++){
			System.out.println(array[i].toString());
		}
	}
}