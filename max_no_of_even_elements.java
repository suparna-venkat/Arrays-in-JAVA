package array_programs;

class max_no_of_even_elements {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 6, 6, 8, 1 };
		System.out.println(max_even_count(arr, 3));

	}

	public static int max_even_count(int[] arr, int k) {
		int n = arr.length;

		// default window
		int current_even_count = 0;
		for (int i = 0; i < k; i++) {
			if (arr[i] % 2 == 0) {
				current_even_count++;

			}
		}
		int max_even_numbers = current_even_count;
		for (int i = 1; i < n - k + 1; i++) {

			if (arr[i - 1] % 2 == 0) {
				current_even_count--;
			}

			if (arr[i + k - 1] % 2 == 0) {
				current_even_count++;
			}

			if (current_even_count > max_even_numbers) {
				max_even_numbers = current_even_count;
			}
		}
		return max_even_numbers;
	}
}
