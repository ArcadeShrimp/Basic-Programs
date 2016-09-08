import java.util.Scanner;

public class SumElementsColumnByColumn {
	public static void main(String[] args) {
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		double [] [] grid = populate();
		
			for(int j=0;j<grid.length+1;j++)
		System.out.println("The sum of the elements in column "+ j + " is "+sum(grid, j));
	}
	public static double [] [] populate(){
		Scanner input = new Scanner(System.in);
		
		double [] [] grid = new double [3][4];
		
		for(int i=0; i<grid.length;i++){
			for(int j=0;j<grid[i].length;j++){
				grid[i][j]=input.nextDouble();
			}
		}
		input.close();
		return grid;
	}
	public static double sum(double [][] grid,int j){
		double sum = 0.0;
		for(int i =0;i<grid.length;i++){
			sum+=grid[i][j];
		}
		return sum;
	}
}
