public class mergSortTwoPointer {
	
	    public static void  mergSort(int []nums1, int m, int []nums2, int n){
	        //solving using two pointers aproach k is fixed
	    	//initilize n,m to varibles 
	        int i = m-1;
	        int j = n-1;
	        int k = m+n-1;
	        //compare j withi and assig them to k
	        //decrement thee loop until the condition is satisfied
	        while(j >= 0){
	            if(i >= 0 && nums1[i] > nums2[j]){//if i>j then k ==i
	                nums1[k] = nums1[i];
	                i--;
	            }else{
	                nums1[k] = nums2[j];//if i<j k == j
	                j--;
	            }
	            k--;
	        }

	    }

	   
	public static void main(String[] args) {

		int [] nums1 = new int[] {1,2,3,0,0,0};
		int [] nums2 = new int[] {2,5,6};
		int m = 3 ,n =3;

		mergSort(nums1,m,nums2,n);

		for(int i=0; i<m+n; i++) {
			System.out.print(nums1[i]+",");
		}
		
		
	}

}
