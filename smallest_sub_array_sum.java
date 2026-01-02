package array_programs;

//**
class smallest_sub_array_sum {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 2, 3, 2 };
		System.out.println(sum_of_smallest_sub_array(arr, 7));
	}

	public static int sum_of_smallest_sub_array(int[] arr, int S) {
		int n = arr.length;
		int starting_point = 0;
		int sum = 0;
		int smallest_of_arr = n + 1;
		for (int end_point = 0; end_point < n; end_point++) {
			sum += arr[end_point];

			while (sum >= S) {
				int length = end_point - starting_point + 1;

				if (length < smallest_of_arr) {
					smallest_of_arr = length;
				}

				sum -= arr[starting_point];
				starting_point++;
			}
		}
		return (smallest_of_arr == n + 1) ? 0 : smallest_of_arr;

	}

}
