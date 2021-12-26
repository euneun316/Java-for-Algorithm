package coding_Level1;

import java.util.Arrays;

// 최대공약수와 최소공배수

public class test14 {
	public static void main(String[] args) {
		Solution14_2 s = new Solution14_2();
		System.out.println(Arrays.toString(s.solution(12, 3)));
	}
}

class Solution14_1 {
	public int[] solution(int n, int m) { // 3 12
		int[] answer = new int[2];
		int big = Math.max(n, m); // 12
		int small = Math.min(n, m); // 3

		answer[0] = gcd(big, small); // 최대공약수 3
		answer[1] = big * small / answer[0]; // 최대공배수 12 * 3 /3 = 12
		return answer;
	}

	// 유클리드 호제법 Method
	static int gcd(int a, int b) { // 12 3
		if (a % b == 0) {
			return b; // 3
		}
		return gcd(b, a % b);
	}
}

class Solution14_2 {
	public int[] solution(int n, int m) { // 3 12

		int[] answer = new int[2];
		int temp = 1;
		int gcd = n * m; // 36

		while (temp != 0) {
			temp = m % n; // temp 12 % 3 = 0 // 3 % 12 = 3
			System.out.println("temp" + temp);
			m = n; // m = 3 // m = 12
			System.out.println("m" + m);
			n = temp; // n = 0 // n = 3
			System.out.println("n" + n);
		}
		answer[0] = m; // 3
		answer[1] = gcd / m; // 36 / 3 = 12
		return answer;

	}
}
