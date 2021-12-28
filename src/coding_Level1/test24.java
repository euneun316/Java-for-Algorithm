package coding_Level1;

//완주하지 못한 선수

import java.util.Arrays;

public class test24 {
	public static void main(String[] args) {
		Solution24_1 s = new Solution24_1();
		String[] arr1 = { "mislav", "stanko", "mislav", "ana" };
		String[] arr2 = { "stanko", "ana", "mislav" };
		System.out.println(s.solution(arr1, arr2));
	}
}

class Solution24_1 {
	public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant); // [ana, mislav, mislav, stanko]
		Arrays.sort(completion); //[ana, mislav, stanko]
		
		for (int i = 0; i < completion.length; i++) {  // 단 한 명의 선수만 못들어 왔으니까
			if (!participant[i].equals(completion[i])) {// 참여자와 완주자가 동일하지 않을 경우
				return participant[i];
			}
		}
		return participant[participant.length - 1]; // participant의 마지막 선수가 못들어 옴
	}
}

class Solution24_2 { // 효율성 테스트 실패
	public String solution(String[] participant, String[] completion) {
		String answer = "";

		for (int i = 0; i < participant.length; i++) {
			boolean check = true;
			for (int j = 0; j < completion.length; j++) {
				if (participant[i].equals(completion[j])) { // 완주자
					completion[j] = null;
					check = false;
					break;
				}
			}
			if (check) { // 완주 못한 선수
				answer += participant[i];
			}
		}
		return answer;
	}
}
