package coding_Level2;

import java.util.LinkedList;
import java.util.Queue;

// 다리를 지나는 트럭

public class test33 {
	public static void main(String[] args) {
		Solution33_1 s = new Solution33_1();
		int[] truck_weights = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		System.out.println(s.solution(100, 100, truck_weights));
	}
}

class Solution33_1 {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		Queue<Integer> que = new LinkedList<Integer>(); // Queue가 다리라고 가정
		int answer = 0;
		int max = 0; // 최대 올라가 있는 트럭 무게

		for (int truck : truck_weights) {

			while (true) {
				if (que.isEmpty()) { // 다리 위에 트럭 없을 경우
					que.add(truck); // 큐에 트럭 무게 객체 추가
					max += truck;
					answer++; // 다리에 오를 때 시간 추가
					break;

				} else if (que.size() == bridge_length) { // 큐에 다리 길이만큼 트럭이 다 찬 경우
					max -= que.poll();

				} else { // 다리 길이만큼 큐에 트럭이 차지 않았을 경우

					if (max + truck <= weight) {// weight 값을 넘지 않는 선에서 새로운 트럭을 다리에 올려줌
						que.add(truck);
						max += truck;
						answer++; // 다리에 오를 때 시간 추가
						break;
					} else { // 다리에 자리는 있지만, 무게 초과 시
						que.add(0); // 자리를 가상으로 채워주기 위해 0을 넣어 이미 큐에 있는 트럭이 다리를 건너게 만듬
						answer++;
					}
				}
			}
		}
		// 마지막 트럭에서 반복문이 끝나는데, 마지막 트럭도 다리 길이만큼 지나가야 하니까  다리 길이 더해줌
		return answer + bridge_length;
	}
}
