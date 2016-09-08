
public class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	Stock(){
		symbol="APP";
		name = "John Cena";	
	}
	Stock(String sym,String name){
		symbol=sym;
		this.name=name;
	}
	
	public void setPreviousClosingPrice(double amount){
		previousClosingPrice=amount;
	}
	public void setCurrentPrice(double amount){
		currentPrice=amount;
	}
	
	public double getChangePercent(double yester, double today){
		if(yester>today){
			return (yester-today)/yester;
		}
		else
			return ((today-yester)/today)*100;
	}
}
