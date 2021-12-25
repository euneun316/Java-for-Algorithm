package coding_Level1;

// 평균 구하기

public class test10 {
	public static void main(String[] args) {
		Solution10 s = new Solution10();
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(s.solution(arr));
	}
}

class Solution10 {
	public double solution(int[] arr) {
		double answer = 0;
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		return answer / arr.length;
	}
}
