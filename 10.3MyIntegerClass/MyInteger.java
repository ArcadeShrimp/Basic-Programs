
public class MyInteger {
	int value;

	MyInteger(int value) {
		this.value = value;
	}

	MyInteger() {
		value = 0;
	}

	public int getMyInteger() {
		return value;
	}

	public boolean isEven() {
		if (value % 2 == 0)
			return true;
		else
			return false;
	}

	public boolean isOdd() {
		if (value % 2 != 0)
			return true;
		else
			return false;
	}

	public boolean isPrime() {
		int checker = (int) Math.sqrt(value);
		for (int i = 1; i < checker; i++) {
			if (value % i == 0)
				return true;
		}
		return false;
	}

	public static boolean isEven(int value) {
		if (value % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(int value) {
		if (value % 2 != 0)
			return true;
		else
			return false;
	}

	public static boolean isPrime(int value) {
		int checker = (int) Math.sqrt(value);
		for (int i = 0; i < checker; i++) {
			if (value % i == 0)
				return true;
		}
		return false;
	}

	public static boolean isEven(MyInteger value) {
		return value.isEven();
	}

	public static boolean isOdd(MyInteger value) {
		return value.isOdd();

	}

	public static boolean isPrime(MyInteger value) {
		return value.isPrime();
	}

	public boolean equals(int value) {
		if (this.value == value)
			return true;
		else
			return false;
	}

	public boolean equals(MyInteger value) {
		return value.equals(this.value);
	}

	public static int parseInt(char[] chars) {
		// I first convert the char array into a string then into an integer
		return Integer.parseInt(new String(chars));
	}

	public static int parseInt(String s) {

		return Integer.parseInt(s);
	}
}
