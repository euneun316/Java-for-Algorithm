package coding_Level1;

// 서울에서 김서방 찾기

public class test03 {
	public static void main(String[] args) {
		Solution3 s = new Solution3();
		String[] seoul = { "Jane","eee","Kim"};
		System.out.println(s.solution(seoul));
	}
}

class Solution3 {
	public String solution(String[] seoul) {
		String answer = "";
		for (int i = 0; i < seoul.length; i++) { // seoul 배열 크기만큼 for문 돌림
			if ("Kim".equals(seoul[i])) { // 배열에서 "Kim" 일치하면,
				answer = "김서방은 " + i + "에 있다";
			}
		}
		return answer;
	}
}
