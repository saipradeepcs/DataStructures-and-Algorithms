
public class LeaderOfAnArray {

	public static void main(String[] args) {
		int[] arr = {5,3,8,15,20,3};
		int length = arr.length;
		int max=arr[length-1];
		System.out.println(arr[length-1]);
		for(int i = length -2; i> 0; i--) {
			if(arr[i] > arr[i-1]) {
				max = arr[i];
				System.out.println(arr[i]);
			}
		}
		
	}
}
