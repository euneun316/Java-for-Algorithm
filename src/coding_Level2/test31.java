package coding_Level2;

// 주식가격

import java.util.Arrays;
import java.util.Stack;

public class test31 {
	public static void main(String[] args) {
		Solution31_1 s = new Solution31_1();
		int[] arr1 = { 1, 2, 3, 2, 3 };
		System.out.println(Arrays.toString(s.solution(arr1)));
	}
}

class Solution31_1 {
	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < prices.length; i++) {

			while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {

				answer[stack.peek()] = i - stack.peek();
				stack.pop();
			}
			stack.push(i);
		}

		while (!stack.isEmpty()) {
			answer[stack.peek()] = prices.length - stack.peek() - 1;
			stack.pop();
		}

		return answer;
	}
}
