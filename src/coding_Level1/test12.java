package coding_Level1;

// 짝수와 홀수

public class test12 {
	public static void main(String[] args) {
		Solution12_1 s = new Solution12_1();
		System.out.println(s.solution(3));
	}
}

class Solution12_1 {
	public String solution(int num) {
		if (num % 2 == 0) {
			return "Even";
		}
		return "Odd";
	}
}

class Solution12_2 {
	public String solution(int num) {
		return num % 2 == 0 ? "Even" : "Odd";
	}
}