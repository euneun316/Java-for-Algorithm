package coding_Level1;

import java.util.Arrays;

// x만큼 간격이 있는 n개의 숫자

public class test08 {
	public static void main(String[] args) {
		Solution8 s = new Solution8();
		System.out.println(Arrays.toString(s.solution(2, 5)));
	}
}

class Solution8 {
	public long[] solution(int x, int n) {

		long[] answer = new long[n]; //n 크기만큼 배열 생성
		long num = x;
		
		for (int i = 0; i < n; i++) {
			answer[i] = num * (i + 1); //첫번 째 숫자에서  1부터 ~ n까지 곱한 수의 나열
		}

		return answer;
	}
}
