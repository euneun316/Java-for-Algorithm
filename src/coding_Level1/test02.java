package coding_Level1;

// 수박수박수박수박수박수?

public class test02 {
	public static void main(String[] args) {
		Solution2_1 s = new Solution2_1();
		System.out.println(s.solution(4));
	}
}

class Solution2_1 {
	public String solution(int n) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) { // 짝수일 때
				sb.append("박");
			} else {		  // 홀수일 때
				sb.append("수");
			}
		}
		return sb.toString();
	}
}

class Solution2_2 {
	public String solution(int n) {
		String answer = "";
        for (int i = 1; i <= n; i++) // 짝수일 때 "박" 홀수일 때 "수"
			answer += i % 2 == 0 ? "박" : "수";
        return answer;
	}
}
