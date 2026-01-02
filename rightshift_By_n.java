package array_programs;

import java.util.Arrays;

class rightshift_By_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		rightShiftbyn(arr, 3);
		System.out.println("Array after right shift by n:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			// (or) System.out.println(Arrays.toString(arr));
		}

	}

	public static void rightShiftbyn(int arr[], int n) {
		for (int i = 1; i <= n; i++) {
			rightShift(arr);
		}
	}

	public static void rightShift(int arr[]) {
		for (int i = arr.length - 2; i >= 0; i--) {
			arr[i + 1] = arr[i];

		}
		arr[0] = 0;

	}
}
