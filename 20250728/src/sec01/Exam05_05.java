package sec01;

public class Exam05_05 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		
		// 2차원 배열이기 때문에 중첩 for문
		// i = 행  j = 열
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				cnt++;
			}
		}
		
		avg = sum / (double) cnt;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}
