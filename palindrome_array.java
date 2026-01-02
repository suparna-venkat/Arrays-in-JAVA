package array_programs;

class palindrome_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3, 2, 1 };
		int[] arr2 = { 1, 2, 3, 4, 5 };

	}

	public static boolean isPalindrome(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] != arr[j]) {
				return false;
			}
			i++;
			j++;
		}
		return true;

	}
}
