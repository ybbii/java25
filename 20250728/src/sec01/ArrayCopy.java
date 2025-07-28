package sec01;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = new int[4];
		
		for (int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		// 향상된 for 문 [index로 작업 안해도 될 떄 사용함] . 읽기도 좋고 사용성이 더 좋음
		for (int x : arr2) {
			System.out.println(x);
		}
		
		// index로 작업해야 할 때 사용
//		for (int i=0; i<arr1.length; i++) {
//			System.out.println(arr2[i]);;
//		}
	}

}
