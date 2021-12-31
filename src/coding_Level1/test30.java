package coding_Level1;

//2018 KAKAO BLIND RECRUITMENT [1차] 비밀지도

import java.util.Arrays;

public class test30 {
	public static void main(String[] args) {
		Solution30_1 s = new Solution30_1();
		int[] arr1 = { 46, 33, 33, 22, 31, 50 };
		int[] arr2 = { 27, 56, 19, 14, 14, 10 };
		System.out.println(Arrays.toString(s.solution(6, arr1, arr2)));
	}
}

class Solution30_1 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
//			String ans = Integer.toString(arr1[i] | arr2[i], 2); // 이진수로 비트 논리 연산 
			String ans = Integer.toBinaryString(arr1[i] | arr2[i]); // 이진수로 비트 논리 연산
			ans = ans.replaceAll("1", "#");
			ans = ans.replaceAll("0", " ");
			answer[i] = ans;
			while (answer[i].length() < n) {
				answer[i] = ' ' + answer[i];
			}
		}
		return answer;
	}
}


