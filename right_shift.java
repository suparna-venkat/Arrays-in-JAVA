package array_programs;

import java.util.Scanner;

class right_shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		rightShift(arr);
		System.out.println("Array after right shift:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void rightShift(int arr[]) {
		for (int i = arr.length - 2; i >= 0; i--) {
			arr[i + 1] = arr[i];

		}
		arr[0] = 0;

	}

}
