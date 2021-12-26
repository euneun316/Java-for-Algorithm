package coding_Level1;

import java.util.Arrays;

// 자연수 뒤집어 배열로 만들기

public class test18 {
	public static void main(String[] args) {
		Solution18 s = new Solution18();
		System.out.println(Arrays.toString(s.solution(12345)));
	}
}

class Solution18 {
	public int[] solution(long n) {
		String s = String.valueOf(n);
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();

		String[] arr = sb.toString().split("");

		int[] answer = new int[sb.length()];
		for (int i = 0; i < arr.length; i++) {
			answer[i] = Integer.parseInt(arr[i]);
		}
		return answer;
	}
}