
public class ArrayRotation {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6};
	int d =1;
//	Anti clockwise rotation
	arr = reverseAnArray(arr, 0, d-1);
	arr = reverseAnArray(arr, d, arr.length-1);
	arr = reverseAnArray(arr, 0, arr.length-1);

	System.out.println("Rotated Array:");
	for(int i=0; i< arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
}
public static int[] reverseAnArray(int[] arr, int low, int high) {
	while(low < high) {
		
		int temp=0;
		temp =arr[low];
		arr[low]=arr[high];
		arr[high]=temp;
		low++;
		high--;
	}
	return arr;
}
public static void swap(int a, int b) {
	int temp=0;
	temp =a;
	a=b;
	b=temp;
}
}
