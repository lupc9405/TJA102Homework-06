package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class hw3_1 {

	public static void main(String[] args) {
		// 1. 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
		// 進階功能: 加入直角三角形的判斷
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入三個數字: ");
		int[] sides = new int[3];
		for (int i = 0; i < sides.length; i++) {
			sides[i] = input.nextInt();
		}
		Arrays.sort(sides);
		
		if (sides[0] + sides[1] > sides[2]) {
			if (sides[0] == sides[1] && sides[1] == sides[2]) {
				System.out.println("正三角形");
			} else if(Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2)) {
				System.out.println("直角三角形");
			} else if (sides[0] == sides[1] || sides[1] == sides[2]){
				System.out.println("等腰三角形");
			} else {
				System.out.println("其它三角形");
			}
		} else {
			System.out.println("不是三角形");
		}	
	}

}
