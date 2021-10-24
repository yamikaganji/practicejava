package PracticePrograms;

import java.util.Scanner;

public class CutTheBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			System.out.println(solve(N, M));
		}

		
	}

	static int solve(int N, int M) {
		return (N - 1) * (M - 1);

	}

}
