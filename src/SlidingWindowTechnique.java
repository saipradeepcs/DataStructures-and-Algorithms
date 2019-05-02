
public class SlidingWindowTechnique {

	public static void main(String[] args) {
		int[] arr = {8,3,4,2,7,9};
		int k =3;
		System.out.println(maxSum(arr, k));
		
	}
	public static int maxSum(int[] arr, int k) {
		int windowSum=0;
		int initialSum=0;
		int n = arr.length;
		for(int i=0; i < k; i++) {
			initialSum = initialSum+arr[i];
		}
		int maxSum=initialSum;
		for(int i=1; i< n-k+1; i++) {
			windowSum = initialSum-arr[i-1] + arr[i+k-1];
			initialSum = windowSum;
			maxSum = Math.max(maxSum, initialSum);
		}
		return maxSum;
	}
}
