package hw3;

import java.util.Scanner;

public class hw3_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文... 請輸入你討厭哪個數字？");
		int input = sc.nextInt();
		int[] arr1 = new int[50];
		int count = 0;
		for (int i = 1; i < 50; i++) {
			if ((i /10) % 10 != input && i % 10 != input) {
				if (count % 5 == 0) {
					System.out.println();
				}
				arr1[i] = i;
				System.out.print(arr1[i] + "\t");
				count +=1;
			}
		}
		System.out.println();
		System.out.println("總共有"+count+"數字可選");
		System.out.println("===================================");
		}

}
