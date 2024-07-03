package sec02;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		int[][] score1 = new int[2][3]; 		// 2개의 행과 3개의 열
		int[][][] score2 = new int[4][5][6];	// 4개의 행과 5개의 열과 6개의 높이
		
		System.out.println(score1.length);		// 2
		System.out.println(score1[0].length);	// 3 (첫번쨰 행의 3개의 열이 있음)
		System.out.println(score1[1].length);	// 3 (두번째 행의 3개의 열이 있음)
		
		
		System.out.println(score2.length);		// 4
		
		int[][] score3 = new int[2][];
		score3[0] = new int[2];			// 첫번째 행의 2개의 열 공간을 만든다
		score3[1] = new int[3];			// 두번째 행의 3개의 열 공간을 만든다
		
		// 다차원 배열 생성과 초기화 같이 하는 방법
		int[][] score4 = {{95, 80}, {92, 96}}; 	// 2개의 행과 2개의 열 공간을 만듬
		System.out.println(score4[0][1]); 		// 80 
		System.out.println(score4[1][1]); 		// 96
		                  		
		int[][] mathScore = new int[2][3];
		for(int i = 0; i<mathScore.length; i++) {
			for(int k = 0; k < mathScore[i].length; k++) {
				System.out.println("mathScore[" + i + "][" + k + "] = "+mathScore[i][k]);
			}
		}
		
	}
}
