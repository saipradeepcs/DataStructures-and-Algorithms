
public class SmallestMissingPositiveInteger {
public static void main(String[] args) {
	int[] arr = {-2,-1,3,4,5,-4};
	int posIndex = segregate(arr, arr.length);
	int[] arr2 = new int[arr.length - posIndex];
	int y=0;
	for(int i=posIndex; i < arr.length; i++) {
		arr2[y] = arr[i];
		y++;
	}
	System.out.println(smallestPositiveInteger(arr2, arr2.length));
}
public static int smallestPositiveInteger(int[] arr, int size) {
	int posIndex = segregate(arr, size);
	for(int i = 0; i<size; i++) {
		int x = Math.abs(arr[i]);
		if(x-1 < size && arr[x-1] > 0) {
			arr[x-1] = -arr[x-1];
		}
	}
	for(int i=0; i < size; i++) {
		if(arr[i] > 0) {
			return i+1;
		}
	}
	return size+1;
}
static int segregate(int[] arr, int size) {
	int j=0, i;
	for(i=0; i<size; i++) {
		if(arr[i] <=0) {
			int temp;
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
	}
	return j;
}
}
