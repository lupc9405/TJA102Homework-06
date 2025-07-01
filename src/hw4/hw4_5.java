package hw4;

import java.util.Scanner;

public class hw4_5 {

	public static void main(String[] args) {
		// 5. 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
		// 例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
		// (提示1：Scanner，陣列)
		// (提示2：需將閏年條件加入)
		// (提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

		int days = 0;
		// 每月天數的陣列
		int[][] yearDay = new int[][] {
			{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 平年 false
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } // 閏年 true
		};

		Scanner input = new Scanner(System.in);
		System.out.println("請分別輸入年/月日(yyyy/mm/dd): ");

		int[] date = new int[3];
		for (int i = 0; i < date.length; i++) {
			date[i] = input.nextInt();
		}

		// 閏年判斷
		boolean LeapYear;
		LeapYear = ((date[0] % 4 == 0) && (date[0] % 100 != 0 || date[0] % 400 == 0));

		boolean isValidDate = true;
		// 擋下錯誤輸入
		// 年不得小於0, 月不得超過1~12, 日不得小於0
		if (date[0] < 1 || date[1] < 1 || date[1] > 12 || date[2] < 1) {
			System.out.println("輸入錯誤! 年、月、日超出基本範圍");
			isValidDate = false;
		}

		// 針對小月, 日期不得超過30
		if ((date[1] == 4 || date[1] == 6 || date[1] == 9 || date[1] == 11) && date[2] > 30) {
			System.out.println("輸入錯誤! 小月只有30天");
			isValidDate = false;
		}

		// 針對大月, 日期不得超過31
		if ((date[1] == 1 || date[1] == 3 || date[1] == 5 || date[1] == 7 || date[1] == 8 || date[1] == 10
				|| date[1] == 12) && date[2] > 31) {
			System.out.println("輸入錯誤! 大月只有31天");
			isValidDate = false;
		}

		// 針對閏年平年, 2月日期判斷
		if (date[1] == 2) { 
			if (LeapYear == true && date[2] > 29) { // 閏年2月不得超過29天
				System.out.println("輸入錯誤! 閏年2月只有29天");
			} else if (LeapYear == false && date[2] > 28) { // 平年2月不得超過28天
				System.out.println("輸入錯誤! 非閏年2月只有28天");
			}
			isValidDate = false;
		}

		if (isValidDate == true) {
			// 月天數計算
			for (int i = 0; i < date[1] - 1; i++) {
				if (LeapYear) {
					days += yearDay[1][i];
				} else {
					days += yearDay[0][i];
				}
			}
			// 日天數計算
			days += date[2];
			System.out.println("輸入的日期為該年第" + days + "天");
		}

	}

}
