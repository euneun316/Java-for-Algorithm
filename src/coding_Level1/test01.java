package coding_Level1;

// 두 정수 사이의 합

public class test01 {
	public static void main(String[] args) {
		Solution1_1 s = new Solution1_1();
		System.out.println(s.solution(5, 3));
	}
}

class Solution1_1 {
	public long solution(int a, int b) {
		long answer = 0;
		
        // a,b 둘중 작은 수 부터 큰 수까지 for문 돌려서 answer에 더하기
		for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
			answer += i;  
		}
		return answer;
	}
}

class Solution1_2 {
	public long solution(int a, int b) {
		long answer = 0;
        // if 조건문으로 a , b 의 대소 구분 후 answer에 더하기
		if (a < b) {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		} else {
			for (int i = b; i <= a; i++) {
				answer += i;
			}
		}
		return answer;
	}
}