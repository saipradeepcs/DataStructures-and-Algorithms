import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumIndex {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t -- > 0){
		    int n = Integer.parseInt(br.readLine());
		    int[] arr = new int[n];
		    String line = br.readLine();
		    String[] strs = line.trim().split("\\s+");
		    for(int i=0; i< strs.length; i++){
		        arr[i] = Integer.parseInt(strs[i]);
		    }
		    int i=0, j=n-1, max = Integer.MIN_VALUE;
		    while(i<j){
		        if(arr[i] <= arr[j]){
		            if(max< (j-i)){
		                max = j-i;
		                i++;
		                if(j != n-1) {
		                	j=n-1;
		                }
//				        j--;
		            }else {
		            	j--;
		            }
		        }
		        
		    }
		    System.out.println(max);
		}
	}
}
