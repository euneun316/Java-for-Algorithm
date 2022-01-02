package coding_Level2;

// 기능개발

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class test32 {
	public static void main(String[] args) {
		Solution32_1 s = new Solution32_1();
		int[] progresses = { 95, 90, 99, 99, 80, 99 };
		int[] speeds = { 1, 1, 1, 1, 1, 1 };
		System.out.println(Arrays.toString(s.solution(progresses, speeds)));
	}
}

class Solution32_1 {
	public int[] solution(int[] progresses, int[] speeds) {

		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> workDay = new LinkedList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < progresses.length; i++) {
			q.add(100 - progresses[i]); // 남은 진도 queue에 넣기
		}

		for (int j = 0; j < speeds.length; j++) {
			if (q.peek() % speeds[j] == 0) {
				workDay.add(q.poll() / speeds[j]);
			} else { // 나누어 떨어지지 않을 때 + 1
				workDay.add(q.poll() / speeds[j] + 1);
			}
		}

		int first = workDay.poll();
		int count = 1;

		for (int i = 1; i < progresses.length; i++) {
			if (first < workDay.peek()) {
				first = workDay.peek();
				result.add(count);
				count = 0;
			}
			workDay.poll();
			count++;

		}
		result.add(count);

		int[] answer = new int[result.size()];
		for (int c = 0; c < answer.length; c++) {
			answer[c] = result.get(c);
		}
		return answer;

	}
}

