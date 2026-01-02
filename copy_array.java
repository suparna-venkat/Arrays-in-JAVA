package array_programs;

class copy_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		int[] arr1 = copy_arr(arr);
		copy_arr(arr);

	}

	public static int[] copy_arr(int[] arr) {
		int[] copy = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		return copy;

	}

}
