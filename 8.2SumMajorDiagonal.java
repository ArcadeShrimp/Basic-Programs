import java.util.Scanner;

public class SumMajorDiagonal {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the length of a square matrix: ");
		int rows = input.nextInt();
		int columns = rows;
		double[][] grid = populate(rows, columns);

		System.out.println("The sum of the numbers on the major diagonal is: " + sum(grid));
	}

	public static double[][] populate(int rows, int columns) {
		double[][] grid = new double[rows][columns];
		System.out.println("Enter the values of your grid row-by-row");

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = input.nextDouble();
			}
		}
		return grid;
	}

	public static double sum(double[][] grid) {
		double sum = 0;

		for (int i = 0; i < grid.length; i++) {

			sum += grid[i][i];

		}
		return sum;
	}
}
