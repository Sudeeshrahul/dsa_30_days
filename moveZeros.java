import java.util.Arrays;

public class moveZeros {
	
		
		 public static void moveZeroes(int[] nums) {
	         int left = 0;
	         int right;
	         for( right = 0; right <= nums.length-1; right++){
	            if (nums[right] != 0){
	                 int temp = nums[left];
	                nums[left] = nums[right];
	                nums[right] = temp;
	                left++;
	            }
	            System.out.println(nums);
	         }
	       
	    }
	
	public static void main(String[] args) {
		int[] arr = {1,0,9,0,2,3}; 
		//moveZeroes(Integer.toString(arr));
		
		//Given an integer array, rearrange it in-place so that all even numbers
		//appear before all odd numbers. The relative order of even or odd numbers 
		//doesn't need to be 
		
//		Input:  [3, 8, 12, 5, 9, 2]
//		Output: [2, 8, 12, 5, 9, 3]  // Any order where evens come before odds is valid
		
		int[] arr1 = {3, 8, 12, 5, 9, 2};
		
		int left = 0;
		for(int right = 0; right <= arr1.length-1; right++)
		{
			if(arr1[right] % 2 == 0) {
				int temp = arr1[left];
				arr1[left] = arr1[right];
				arr1[right] = temp;
				left++;
			}
			System.out.println("Swapping " + arr1[right] + " and " + arr1[left] + ": " + Arrays.toString(arr1));
			
		}
		System.out.println(Arrays.toString(arr1));
	}

}
