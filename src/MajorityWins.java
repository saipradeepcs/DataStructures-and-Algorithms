
public class MajorityWins {

	public void majorityWins(int[] arr, int n, int x, int y) {
		
		int count_x=0, count_y=0;
		
		for(int i=0; i< n; i++) {
			if(arr[i]==x){
				count_x++;
			}
			if(arr[i]==y) {
				count_y++;
			}
			
		}
		if(count_x>=count_y) {
			System.out.println(x);
		}else if(count_y > count_x) {
			System.out.println(y);
			
		}else {
			System.out.println(Math.min(x, y));
		}
	}
}
