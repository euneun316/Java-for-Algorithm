package coding_Level1;

// 약수의 합

public class test04 {
	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(s.solution(12));
	}
}

class Solution4 {
	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n / 2; i++) { 
			if (n % i == 0) 
				answer += i;
		}
		return answer + n;
	}
}
