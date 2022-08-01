import java.lang.Math;

public class myClass{

	public static void main(String[] args){

		int[] nums = new int[10];

		for(int i = 0; i < nums.length; i++){
			nums[i] = (int)(Math.random() *100) + 1;
		}

		for(int i = 0; i < nums.length-1; i++){
			for(int j = i+1; j < nums.length; j++){
				if(nums[i] < nums[j]){
					swap(nums, i, j);
				}
			}
		}

		for(int i = 0; i < nums.length; i++){
			System.out.print(nums[i] + ", ");
		}
	}

	public static void swap(int[] nums, int spot1, int spot2){
		int temp = nums[spot1];
		nums[spot1] = nums[spot2];
		nums[spot2] = temp;
	}
}