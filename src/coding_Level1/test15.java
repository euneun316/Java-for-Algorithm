package coding_Level1;

// 정수 제곱근 판별

public class test15 {
	public static void main(String[] args) {
		Solution15_1 s = new Solution15_1();
		System.out.println(s.solution(121));
	}
}

class Solution15_1 {
	public long solution(long n) {
		// 121의 제곱근을 2제곱한것이 == n과 같다면 ? 
		if (Math.pow((int) Math.sqrt(n), 2) == n) {
			return (long) Math.pow(Math.sqrt(n) + 1, 2); // + 1 한 후 2제곱해서 리턴
		} 			
		return -1; // 아닐 경우 -1
	}
}

class Solution15_2 {
	public long solution(long n) {
		long answer = 0;
		double a = Math.sqrt(n);
		String t = Double.toString(a);
		String[] s = t.split("\\.");

		for (int i = 0; i < s.length; i++) {

			if ("0".equals(s[1])) {
				answer = (long) Math.pow(a + 1, 2);
			} else {
				answer = -1;
			}
		}
		return answer;
	}
}