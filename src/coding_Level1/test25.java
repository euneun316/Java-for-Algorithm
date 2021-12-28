package coding_Level1;

// 2016년

public class test25 {
	public static void main(String[] args) {
		Solution25_1 s = new Solution25_1();
		System.out.println(s.solution(1, 1));
	}
}

class Solution25_1 {
	public String solution(int a, int b) {
		String answer = "";
		String[] day = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		String[] year = new String[366]; // 윤년이라 366일
		int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int answer_day = 0;

		for (int i = 0; i < year.length; i++) {
			year[i] = day[(i + 5) % 7]; // 1월 1일 FRI
		}

		for (int i = 0; i < a - 1; i++) {
			answer_day += month[i];
		}
		answer = year[answer_day + b - 1];
		return answer;
	}
}
