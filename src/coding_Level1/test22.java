package coding_Level1;

// 나누어 떨어지는 숫자 배열

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test22 {
	public static void main(String[] args) {
		Solution22_1 s = new Solution22_1();
		int[] arr1 = { 3, 2, 6 };
		int a = 10;
		System.out.println(Arrays.toString(s.solution(arr1, a)));
	}
}

class Solution22_1 {
	public int[] solution(int[] arr, int divisor) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i : arr) {
			if (i % divisor == 0) {//나누어 떨어지면
				list.add(i);
			}
		}
		Collections.sort(list); // 오름차순으로 정렬
		
		if (list.isEmpty() == true) { //나누어 떨어지는 게 없다면
			list.add(-1);
		}

		int[] answer = new int[list.size()];
		for (int j = 0; j < answer.length; j++) {
			answer[j] = list.get(j);
		}

		return answer;
	}
}