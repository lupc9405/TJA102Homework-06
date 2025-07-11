package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
	請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
	Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
*/

public class hw7_1 {
	public static void main(String args[]) {
		File f = new File(".\\src\\hw7\\Sample.txt");

		try {
			FileReader fr = new FileReader(f); // 低階資料流
			BufferedReader br = new BufferedReader(fr); // 高階資料流

			String str; // 每列字串
			int countRow = 0; // 計算readLine()的列數
			int sum = 0; // 計算每次readLine()字串的長度
			while ((str = br.readLine()) != null) { // while (傳進來的值不是null)
				sum += str.length();
				countRow++;
			}
			System.out.println(f.getName() + "檔案共有: " + f.length() + " 個位元組, " + sum + " 個字元, " + countRow + " 列資料");

			br.close();
			fr.close();
		} catch (IOException e) {

		}

	}
}
