package coding_Level1;

import java.util.Scanner;

// 직사각형 별찍기

public class test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		sc.close();
	}
}