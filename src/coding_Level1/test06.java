package coding_Level1;

import java.util.*;

//같은 숫자는 싫어

public class test06 {
	public static void main(String[] args) {
		Solution6 s = new Solution6();
		int[] arr = { 4, 4, 4, 3, 3 };
		System.out.println(Arrays.toString(s.solution(arr)));
	}
}

class Solution6 {
	public int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);   //list에 첫번 째 숫자 넣어줌
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {//arr[1]부터 직전 숫자와 비교, 
				list.add(arr[i]);      //다르면 list에 add
			}
		}
		
		int[] answer = new int[list.size()]; //list 크기만큼 배열 생성
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i); // list에서 꺼내서 배열에 담는다.
		}
		return answer;
	}
}
