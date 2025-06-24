public class twoSum {
	public int[] twooSum(int[] nums, int target) {
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]+nums[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return null;
	}
	public static void main(String[] args) {
		twoSum n1 = new twoSum();
		int[] nums = new int[]{1,2,3,4,5,6,7};
		int[] result = n1.twooSum(nums, 5);
		
		 if (result != null) {
	            System.out.println("Indices: " + result[0] + ", " + result[1]);
	        } else {
	            System.out.println("No valid pair found.");
	        }
	}

}
