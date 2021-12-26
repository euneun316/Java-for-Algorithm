package coding_Level1;

import java.util.Arrays;

// 정수 내림차순으로 배치하기

public class test17 {
	public static void main(String[] args) {
		Solution17 s = new Solution17();
		System.out.println(s.solution(118372));
	}
}

class Solution17 {
	public long solution(long n) {
		long answer = 0;
		String[] arr = String.valueOf(n).split("");
		Arrays.sort(arr);

		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			sb.append(arr[i]);
		}
		answer = Long.parseLong(sb.toString());
		return answer;
	}
}