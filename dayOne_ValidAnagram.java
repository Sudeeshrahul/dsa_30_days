import java.util.Arrays;

public class dayOne_ValidAnagram {

	public boolean ValidAnagram(String s, String t) {
	//for anagrams the length must be == if != they are not anagrams
		if(s.length() != t.length()) 
			return false;
		
		char arr1[] = s.toCharArray();
		char arr2[] = t.toCharArray();
		
		//Sorting the first char Array
		for(int i=0; i < arr1.length-1; i++) {
			for(int j=0; j < arr1.length-1-i; j++) {
				if(arr1[j] > arr1[j+1]) {
					//swapping if the alphabet is greater than next alp
					char swap = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = swap;
				}
			}
		}
		//Sorting the second char array
		for(int i=0; i < arr2.length-1; i++) {
			for(int j=0; j < arr2.length-i-1; j++) {
				if(arr2[j] > arr2[j+1]) {
					//swapping the alphabet is greater than next alp
					char swap = arr2[j];
					arr2[j] = arr2[j+1];
					arr2[j+1] = swap;
				}
			}
		}
	//equals method compare the two arrays and return true if equal
	return Arrays.equals(arr1, arr2);
	}
	
	//--------let-code-solution-------------
	public boolean method2Anagram(String s, String t) {
		char arr1[] = s.toCharArray();
		char arr2[] = t.toCharArray();
		
		if(s.length() != t.length()) {
			return false;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}
	
	
	public static void main(String[] args) {
		dayOne_ValidAnagram check = new dayOne_ValidAnagram();
		boolean method1 = check.ValidAnagram("rat", "tar");
		System.out.println(method1);
		
		boolean method2 = check.method2Anagram("ramramramramram", "marmarmarmarmar");
		System.out.println(method2);
	}
}