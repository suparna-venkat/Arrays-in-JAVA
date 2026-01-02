package array_programs;

class longest_sub_array {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 2, 1, 1, 1, 5 };
		System.out.println(sum_of_longest_sub_array(arr, 5));
	}

	public static int sum_of_longest_sub_array(int[] arr, int S) {
		int n = arr.length;
		int starting_point = 0;
		int sum = 0;
		int largest_of_arr = 0;
		for (int end_point = 0; end_point < n; end_point++) {
			sum += arr[end_point];

			while (sum > S) {

				sum -= arr[starting_point];
				starting_point++;
			}

			int current_length = end_point - starting_point + 1;
			if (current_length > largest_of_arr) {
				largest_of_arr = current_length;
			}
		}

		return largest_of_arr;

	}
}
