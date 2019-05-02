
public class LargestAndSecondLargest {

	public static void largestAndSecondLargest(int sizeOfArray, int[] arr) {
		int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        if(sizeOfArray == 1) {
        	max = arr[0];
        	max2 = -1;
        }
        for(int i=0; i< sizeOfArray; i++) {
        	if(arr[i] > max) {
        		max2 = max;
        		max = arr[i];
        		
        	}else if(arr[i] > max2 && arr[i]!= max) {
        		max2 = arr[i];
        	}
        }
        
	}
}
