package hw7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
	請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。
	呼叫此方法時，第一個參數所代表的檔案會複製到第二個參數代表的檔案
 */

public class hw7_3 {
	
	public static void main(String[] args) {
		File source = new File(".\\src\\hw7\\ChineseLoremIpsum.txt"); // 源頭
		File dest = new File(".\\src\\hw7\\ChineseLoremIpsumCopy.txt"); // 目的地
		
		copyFile(source, dest);
		
	}
	
	public static void copyFile(File source, File dest) {
		try {
			// 建立輸入/輸出資料流
			FileReader fr = new FileReader(source); // 低階資料流 接 源頭
			FileWriter fw = new FileWriter(dest); // 低階資料流 接 目的地

			// 建立緩衝區 每次讀取4096 字元
			int length;
			char[] ch = new char[4096];
			
			// 讀取資料存入陣列, 直到沒資料為止
			while ((length = fr.read(ch)) != -1) {
				fw.write(ch, 0, length); // 陣列字元寫進目的地
				fw.flush();
			}

			fw.close();
			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
