package coding_Level1;

//예산
import java.util.Arrays;

public class test27 {
	public static void main(String[] args) {
		Solution27_1 s = new Solution27_1();
		int[] arr = { 1, 3, 2, 5, 4 };
		System.out.println(s.solution(arr, 10));
	}
}

class Solution27_1 {
	public int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d); // 오름차순 정렬
		int sum = 0;

		for (int i = 0; i < d.length; i++) {
			sum += d[i];
			if (sum > budget) {
				break;
			}
			answer++;
		}
		return answer;
	}
}
