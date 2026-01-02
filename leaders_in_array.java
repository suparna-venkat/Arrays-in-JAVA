package array_programs;

class leaders_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5,6,7};
		
		
		System.out.println(leaders_in_array (int [] arr));

	}

	public static void leaders_in_array(int[] arr) {
		System.out.println(arr[arr.length - 1]);
		int i = arr.length - 2;
		while (i >= 0) {
			boolean flag = true;
			for (int j = i + 1; j <= arr.length; j++) {
				if (arr[i] < arr[j]) {
					flag = false;

				}
			}
			if (flag == true) {
				System.out.println(arr[i]);
			}
			i--;
		}
	}

}
