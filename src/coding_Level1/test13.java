package coding_Level1;

// 자릿수 더하기

public class test13 {
	public static void main(String[] args) {
		Solution13_2 s = new Solution13_2();
		System.out.println(s.solution(987));
	}
}

class Solution13_1 {
	public int solution(int n) {
		int answer = 0;

		while (n > 0) {
			answer += n % 10; // 일의 자리부터 자릿수 더하기
			n /= 10;
		}
		return answer;
	}
}

class Solution13_2 {
	public int solution(int n) {
		int answer = 0;
		String[] arr = String.valueOf(n).split("");

		for (String a : arr) {
			answer += Integer.parseInt(a);
		}
		return answer;
	}
}
