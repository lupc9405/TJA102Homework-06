package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
	請寫一隻程式，能夠亂數產生10個1～1000的整數，
	並寫入一個名為Data.txt的檔案裡
	(請使用append功能讓每次執行結果都能被保存起來)
 */

public class hw7_2 {

	public static void main(String[] args) {

		try {
			File data = new File(".\\src\\hw7\\Data.txt");
			FileOutputStream fos = new FileOutputStream(data, true);  // 低階資料流, append
			PrintStream ps = new PrintStream(fos); // 將資料以文字形式顯示

			for (int i = 0; i < 10; i++) {
				int num = (int) (Math.random() * 1000) + 1;
				ps.print(num + "\t");
			}
			ps.print("\n"); // 迴圈執行結束換行
			ps.flush();

			ps.close();
			fos.close();

		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
