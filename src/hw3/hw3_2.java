package hw3;

import java.util.Scanner;

public class hw3_2 {
	public static void main(String[] args) {
	// 2. 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息
	
	
	int guess = (int)(Math.random() * 101);
	Scanner sc1 = new Scanner(System.in);
	
	boolean ans = true;
	while (ans) {
		System.out.println("開始猜數字吧！");
		int input = sc1.nextInt();
		
		if (input > guess) {
			System.out.println("猜大囉！");
		} else if (input < guess) {
			System.out.println("猜小囉！");
		} else {
			System.out.println("答對囉！答案就是"+ guess + "\n");
			ans = false;
		}
	}

	
	}
}
