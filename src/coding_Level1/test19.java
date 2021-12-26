package coding_Level1;

// 핸드폰 번호 가리기

public class test19 {
	public static void main(String[] args) {
		Solution19_2 s = new Solution19_2();
		System.out.println(s.solution("027778888"));
	}
} 

class Solution19_1 {
	public String solution(String phone_number) {
		StringBuilder sb = new StringBuilder();
		String[] num = phone_number.split("");

		for (int i = 0; i < num.length; i++) {
			if (i > num.length - 5) { // 뒷 4자리
				sb.append(num[i]);
			} else {
				sb.append("*");
			}
		}
		return sb.toString();
	}
}

class Solution19_2 {
	public String solution(String phone_number) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < phone_number.length() - 4; i++) { 
			sb.append("*");
		}
		sb.append(phone_number.substring(phone_number.length() - 4)); //beginindex 위치에서 끝까지 잘라낸 문자열

		return sb.toString();
	}
}