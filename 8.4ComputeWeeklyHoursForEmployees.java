
public class ComputeWeeklyHoursForEmployees {
	public static void main(String[] args) {
		int[][] schedule = { { '2', '4', '3', '4', '5', '8', '8' }, { '7', '3', '4', '3', '3', '4', '4' },
				{ '3', '3', '4', '3', '3', '2', '2' }, { '9', '3', '4', '7', '3', '4', '1' },
				{ '3', '5', '4', '3', '6', '3', '8' }, { '3', '4', '4', '6', '3', '4', '4' },
				{ '3', '7', '4', '8', '3', '8', '4' }, { '6', '3', '5', '9', '2', '7', '9' } };
		int[] total = populate(schedule);
		/*
		 * Now we have the schedule and total hours for each employee
		 */
		printInOrder(schedule, total);
	}

	public static int[] populate(int[][] grid) {
		int[] total = new int[grid.length];

		for (int i = 0; i < grid.length; i++) {
			int sum = 0;
			for (int j = 0; j < grid[i].length; j++) {
				sum += grid[i][j];
			}
			total[i] = sum;
		}
		return total;
	}

	public static void printInOrder(int[][] grid, int[] array) {
		/*
		 * Find max first
		 */
		int max = max(array);
		System.out.println(max);
		for (int i = max; i > 0; max--)
			for (int j = 0; j < array.length; j++)
				if (max == array[j]) {
					System.out.println("Employee " + j + " has " + max + " hours this week.");
				}
	}

	public static int max(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}

		return max;
	}
}
