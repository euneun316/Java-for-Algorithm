package coding_Level1;

// 문자열 다루기 기본

public class test16 {
	public static void main(String[] args) {
		Solution16_1 s = new Solution16_1();
		System.out.println(s.solution("a234"));
	}
}

class Solution16_1 {
	public boolean solution(String s) {
		boolean answer = true;
		if (s.length() == 4 || s.length() == 6) {
			try {
				Integer.parseInt(s); // java.lang.NumberFormatException error 발생
				answer = true;
			} catch (NumberFormatException e) { //String -> int로 변환 불가
				answer = false;
			}
		} else {
			answer = false;
		}
		return answer;
	}
}

class Solution16_2 {
	public boolean solution(String s) {
		boolean answer = true;
		String[] arr = s.split("[0-9]");
		// arr에 문자열만 저장됨
		if ((s.length() != 4 && s.length() != 6) || arr.length > 0) {
			answer = false;
		}
		return answer;
	}
}