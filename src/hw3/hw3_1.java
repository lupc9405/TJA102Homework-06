package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class hw3_1 {

	public static void main(String[] args) {
		// 1. 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個數字：");
		int[] triangle = new int[3];
		for (int i = 0; i < triangle.length; i++) {
			triangle[i] = sc.nextInt();
		}
		Arrays.sort(triangle);
		
		if (triangle[0] + triangle[1] > triangle[2] && triangle[0] + triangle[2] > triangle[1]) {
			if (triangle[0] == triangle[1] && triangle[1] == triangle[2]) {
				System.out.println("正三角形");
			} else if(Math.pow(triangle[0], 2) + Math.pow(triangle[1], 2) == Math.pow(triangle[2], 2)) {
				System.out.println("直角三角形");
			} else if (triangle[0] == triangle[1] || triangle[1] == triangle[2]){
				System.out.println("等腰三角形");
			} else {
				System.out.println("其它三角形");
			}
		} else {
			System.out.println("不是三角形");
		}	
	}

}
