package hw5;

/*
 * 請設計一個方法為starSquare(int width, int height)
 * 當使用者鍵盤輸入寬與高時，即會印出對應的*長方形 
 */
import java.util.Scanner;

public class hw5_1_PrintStar {

	public static void main(String[] args) {
		// 使用者輸入寬與高
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入寬與高: ");
		int width = input.nextInt(); // 寬
		int height = input.nextInt(); // 高

		// 建立物件
		PrintStar printStar = new PrintStar();

		// 呼叫starSquare()
		printStar.starSquare(width, height);

	}

}
