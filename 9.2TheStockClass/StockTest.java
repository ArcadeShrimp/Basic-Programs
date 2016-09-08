import java.util.Scanner;
public class StockTest {
	public static void main(String[]args){
		Stock myStock = new Stock("ORCL", "Oracle Corporation");
		myStock.setCurrentPrice(34.45);
		myStock.setPreviousClosingPrice(34.5);
		System.out.println("The price change percent is: " + myStock.getChangePercent(34.5, 34.45)+"%");
	}
}
