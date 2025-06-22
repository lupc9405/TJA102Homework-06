package hw3;

import java.util.Scanner;

public class hw3_2 {
	public static void main(String[] args) {
	// 2. 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息
	// 進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案
	
	int answer = (int)(Math.random() * 101);
	Scanner input = new Scanner(System.in); 
	
	boolean keepGuessing = true; 
	while (keepGuessing) {
		System.out.println("開始猜數字吧！\n請輸入你猜的數字(0~100): ");
		int guess = input.nextInt();
		
		if (guess > answer) {
			System.out.println("猜錯囉！大於正確答案！\n==========");
		} else if (guess < answer) {
			System.out.println("猜錯囉！小於正確答案！\n==========");
		} else {
			System.out.println("答對囉！答案就是 "+ answer + "！");
			keepGuessing = false;
		}
	}

	
	}
}
