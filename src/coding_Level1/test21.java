package coding_Level1;

// 하샤드 수

public class test21 {
	public static void main(String[] args) {
		Solution21_2 s = new Solution21_2();

		System.out.println(s.solution(11));
	}
}

class Solution21_1 {
	public boolean solution(int x) {
		int sum = 0;
		int i = x;

		while (i > 0) {
			sum += i % 10;
			i /= 10;
		}

		if (x % sum == 0) {
			return true;
		}
		return false;
	}
}

class Solution21_2 {
	public boolean solution(int x) {
		int sum = 0;
		String[] sArr = String.valueOf(x).split("");

		for (String s : sArr) {
			sum += Integer.parseInt(s);
		}
		if (x % sum == 0) {
			return true;
		}
		return false;
	}
}
