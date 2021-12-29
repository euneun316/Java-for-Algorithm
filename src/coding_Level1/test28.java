package coding_Level1;

//체육복

import java.util.Arrays;

public class test28 {
	public static void main(String[] args) {
		Solution28_1 s = new Solution28_1();
		int[] lost = { 2, 4 }; // 잃어버린 친구들
		int[] reserve = { 2, 3, 5 }; // 여벌 가져온 친구들
		System.out.println(s.solution(5, lost, reserve)); // 체육수업을 들을 수 있는 학생의 최댓값
	}
}

class Solution28_1 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length; // 전체 학생 수 - 잃어버린 학생 수
		Arrays.sort(lost); 
		Arrays.sort(reserve); //오름차순 정렬 
		
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) { // 여벌 가져온 친구가 도난당했을 때
					answer++;
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
			}
		}

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if ((lost[i] - 1 == reserve[j]) || (lost[i] + 1 == reserve[j])) { // 앞 뒤 애들한테 빌려주기
					answer++;
					reserve[j] = -1;
					break;
				}
			}
		}
		return answer;
	}
}
