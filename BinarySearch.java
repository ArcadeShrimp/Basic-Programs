
public class BinarySearch {
	public static void main(String[] args){
		int [] Asana = {1,2,3,4,5,6,7,8,9,123,1234};
		System.out.println(binarySearch(Asana,1234));
	}
	public static int binarySearch(int [] list, int key){
		int low = 0;
		int high = list.length - 1;
		
		
		while (high >= low){
			int mid = (low+high)/2;
			if(key<list[mid]){
				high = mid-1;
			}
			else if (key == list[mid]){
				return mid;
			}
			else{
				low = mid+1;
			}
			
		}
		return -low-1;
	}
}
