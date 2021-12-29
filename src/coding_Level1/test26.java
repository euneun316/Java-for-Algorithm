package coding_Level1;

// 소수찾기

public class test26 {
	public static void main(String[] args) {
		Solution26_1 s = new Solution26_1();

		System.out.println(s.solution(3));
	}
}

class Solution26_1 {
	public int solution(int n) { // 10
		int answer = 1; // n은 2이상이라고 했으니, 2는 무조건 포함

		for (int i = 3; i <= n; i++) {
			int count = 0;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				answer++; // 소수 개수++
			}
		}
		return answer;
	}
}