package sec02;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		
		int[] score = {83, 90, 87};
		
		System.out.print("score[0] : " + score[0] + ", ");
		System.out.print(" score[1] : " + score[1] + ", ");
		System.out.println(" score[2] : " + score[2]);
		
		score[2] = 88;  
		
		int sum = 0;
		for(int i = 0; i< score.length; i++) {
			sum += score[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
	}
}
