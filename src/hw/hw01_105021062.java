package hw;

import java.util.Scanner;

public class hw01_105021062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入媽媽給小明多少錢");
		int n = scn.nextInt();
		System.out.println("輸入a1顆蘋果 a2顆柳丁 a3棵桃子");
		int a1 = scn.nextInt();
		int a2 = scn.nextInt();
		int a3 = scn.nextInt();
		if (n < (a1 * 15 + a2 * 20 + a3 * 30)) {
			System.out.println("0");
		} else if (n >= (a1 * 15 + a2 * 20 + a3 * 30)) {
			int d = n - (a1 * 15 + a2 * 20 + a3 * 30);
			System.out.println("50元" + d / 50);
			System.out.println("10元" + d % 50 / 10);
			System.out.println("1元" + d % 50 % 10);

		}

	}

}