
public class MyIntegerClient {
	public static void main(String[] args) {
		MyInteger number = new MyInteger();
		System.out.println(number.value + " "
				+ number.isEven() + " "
				+ number.isOdd() + " "
				+ number.isPrime() + " "
				+ number.equals(10));
		
		number = new MyInteger(31);
		System.out.println(number.value + " "
				+ number.isEven() + " "
				+ number.isOdd() + " "
				+ number.isPrime() + " "
				+ number.equals(31));
		
		MyInteger numbertwo = new MyInteger(15);
		System.out.println(numbertwo.value+" "
				+ numbertwo.isEven()+" "
				+ numbertwo.isOdd()+" "
				+ numbertwo.isPrime()+" "
				+ numbertwo.equals(number));
		char[] array = {'4','5','3'};
		MyInteger numberthree = new MyInteger(MyInteger.parseInt(array));
		System.out.println(numberthree.value+" "
				+ numberthree.isEven()+" "
				+ numberthree.isOdd()+" "
				+ numberthree.isPrime()+" "
				+ numberthree.equals(number));
		
		String s = "4747736";
		MyInteger numberfour = new MyInteger(MyInteger.parseInt(s));
		System.out.println(numberfour.value+" "
				+ numberfour.isEven()+" "
				+ numberfour.isOdd()+" "
				+ numberfour.isPrime()+" "
				+ numberfour.equals(number));
		
	}
}
