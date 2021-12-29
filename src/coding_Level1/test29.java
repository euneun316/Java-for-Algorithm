package coding_Level1;

// 시저암호

public class test29 {
	public static void main(String[] args) {
		Solution29_1 s = new Solution29_1();
		System.out.println(s.solution("z", 1));
	}
}

class Solution29_1 {
	public String solution(String s, int n) {
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			char alpa = s.charAt(i);

			if (alpa >= 'a' && alpa <= 'z') { // 소문자
				if (alpa + n > 'z') // z가 있을 때,
					answer += (char) (alpa + n - 26);
				else
					answer += (char) (alpa + n);
			} else if (alpa >= 'A' && alpa <= 'Z') { // 대문자
				if (alpa + n > 'Z') // Z가 있을 때,
					answer += (char) (alpa + n - 26);
				else
					answer += (char) (alpa + n);
			} else
				answer += (char) alpa;

		}

		return answer;
	}
}