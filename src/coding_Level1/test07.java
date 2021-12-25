package coding_Level1;

// 가운데 글자 가져오기

public class test07 {
	public static void main(String[] args) {
		Solution7 s = new Solution7();
		System.out.println(s.solution("qwer"));
	}
}

class Solution7 {
	public String solution(String s) {
		String answer = "";
		if (s.length() % 2 == 1) { //글자수가 홀수
			answer = s.substring(s.length() / 2, s.length() / 2 + 1);
		} else { //글자수가 짝수
			answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
		}
		return answer;
	}
}
