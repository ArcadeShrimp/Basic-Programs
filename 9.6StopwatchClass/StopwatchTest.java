
/*
 * Okay, I am going going to do a cool thing where I implement selection sort and measure the time it takes
 * to sort 100,000 yes, I repeat 100,000 numbers. 
 * */
import java.util.Random;

public class StopwatchTest {
	public static void main(String[] args) {

		Random r = new Random();
		int[] array = new int[100000];

		randomizeArray(array, r);
		initializeTest(array);
	}

	public static void randomizeArray(int[] array, Random r) {
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(101);
		}
	}

	public static void initializeTest(int[] array) {
		Stopwatch s = new Stopwatch();
		s.startTime();
		int temp = 0;
		int minIndex = 0;
		int min = 0;
		for (int i = 0; i < array.length; i++) {
			min = array[i];
			minIndex = i;
			for (int j = i; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}
			if (min < array[i]) {
				temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
		s.endTime();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("It took: " + s.getElapsedTime() + " milliseconds");
	}
}
