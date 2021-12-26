package coding_Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// K번째수

public class test20 {
	public static void main(String[] args) {
		Solution20_1 s = new Solution20_1();
		int[] arr1 = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] arr2 = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		System.out.println(Arrays.toString(s.solution(arr1, arr2)));
	}
}

class Solution20_1 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < commands.length; i++) {
			for (int j = commands[i][0]; j <= commands[i][1]; j++) {
				list.add(array[j - 1]);
				Collections.sort(list); // ArrayList 오름차순 정렬
			}
			answer[i] = list.get(commands[i][2] - 1);
			list.clear();
		}

		return answer;
	}
}

class Solution20_2 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			// 원본 배열, 복사할 시작인덱스, 복사할 끝인덱스

			Arrays.sort(temp); // 배열 오름차순 정렬
			answer[i] = temp[commands[i][2] - 1];
		}
		return answer;
	}
}

class Solution20_3 {
	public static int[] solution(int[] array, int[][] commands) { // {1,5,2,6,3,7,4} / {{2,5,3},{4,4,1},{1,7,3}}
		int[] answer = new int[commands.length]; // 3
		int n = 0;

		for (int i = 0; i < commands.length; i++) {
			int k = 0;
			int[] list = new int[commands[i][1] - commands[i][0] + 1]; // new int[4] // new int[1] // new int[7]
			for (int j = commands[i][0]; j <= commands[i][1]; j++) { // j = 2 ~ 5 //j = 4 ~ 4 // j= 1 ~ 7
				list[k++] = array[j - 1]; // {5,2,6,3}// {6} // {1,5,2,6,3,7,4}
			}
			Arrays.sort(list); // 오름차순 정렬 {2,3,5,6} // {6} // {1,2,3,4,5,6,7}
			answer[n++] = list[commands[i][2] - 1]; // {5,6,3}
		}
		return answer;
	}
}