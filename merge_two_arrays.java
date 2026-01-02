package array_programs;

class merge_two_arrays {
	public static void main(String[] args) {

		int[] array1 = { 10, 20, 30 };
		int[] array2 = { 40, 50, 60, 70 };
		int[] mergedArray = merge_arr(array1, array2);
		for (int num : mergedArray) {
			System.out.print(num + " ");
		}
	}

	public static int[] merge_arr(int[] arr, int[] arr2) {
		int[] merge = new int[arr.length + arr2.length];
		int k = 0;
		for (int num : arr) {
			merge[k++] = num;
		}
		for (int num : arr2) {
			merge[k++] = num;
		}
		return merge;
	}
}
