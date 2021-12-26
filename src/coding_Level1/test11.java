package coding_Level1;

// 행렬의 덧셈

public class test11 {
	public static void main(String[] args) {
		Solution11_2 s = new Solution11_2();
		int[][] arr = { { 1, 2 }, { 2, 3 } };
		int[][] arr2 = { { 3, 4 }, { 5, 6 } };
		System.out.println(s.solution(arr, arr2));
	}
}

class Solution11_1 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return answer;
	}
}

class Solution11_2 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = {};
		answer = arr1;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				answer[i][j] += arr2[i][j];
			}
		}
		return answer;
	}
}