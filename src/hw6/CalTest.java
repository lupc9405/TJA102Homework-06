package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest  {
	public static void main(String[] args) {
		Calculator c = new Calculator();

		while (true) { // 直到輸入正確的值為止
			try {
				System.out.println("請輸入x的值:");
				Scanner i1 = new Scanner(System.in);
				int x = i1.nextInt();

				System.out.println("請輸入y的值:");
				Scanner i2 = new Scanner(System.in);
				int y = i2.nextInt();
				int powerXY = c.powerXY(x, y);
				System.out.println(x + "的" + y + "次方等於" + powerXY);
				break;
			} catch (InputMismatchException e) { // 不為數字
				System.out.println("輸入格式錯誤！");
			} catch (CalException c1) { // 自定義例外處理
				System.out.println(c1.getMessage());
			}

		}

	}
}
