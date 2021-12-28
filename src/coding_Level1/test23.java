package coding_Level1;

import java.util.ArrayList;
import java.util.Arrays;

// 모의고사
// 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
// 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
// 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

public class test23 {
	public static void main(String[] args) {
		Solution23_1 s = new Solution23_1();
		int[] arr1 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(s.solution(arr1)));
	}
}

class Solution23_1 {
	public int[] solution(int[] answers) {
		int[] score = new int[3];
		int[] a1 = { 1, 2, 3, 4, 5 }; // 5개
		int[] a2 = { 2, 1, 2, 3, 2, 4, 2, 5 };// 8개
		int[] a3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };// 10개

		for (int i = 0; i < answers.length; i++) { // 정답을 맞출 경우 점수 ++
			if (a1[i % 5] == answers[i]) {
				score[0]++;
			}
			if (a2[i % 8] == answers[i]) {
				score[1]++;
			}
			if (a3[i % 10] == answers[i]) {
				score[2]++;
			}
		}
//		System.out.println(Arrays.toString(score));

		int max = Math.max(Math.max(score[0], score[1]), score[2]); // 3명 중 가장 정답 많이 맞춘 점수 구하기
//		int max = Integer.max(Integer.max(score[0], score[1]),score[2]);
		ArrayList<Integer> list = new ArrayList<Integer>();

		if (max == score[0]) { // 가장 정답 많이 맞춘 수포자 list에 넣기
			list.add(1);
		}
		if (max == score[1]) {
			list.add(2);
		}
		if (max == score[2]) {
			list.add(3);
		}
		int[] answer = new int[list.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}