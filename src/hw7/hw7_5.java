package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
	承上題，請寫一個程式，能讀取Object.ser這四個物件，
	並執行speak()方法觀察結果如何(請利用多型簡化本題的程式設計)
 */

public class hw7_5 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\data\\Object.ser");

		// 讀取Object.ser
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

		try {
			while (true) {
				((Animal) ois.readObject()).speak(); 
				// 不能用ois.readObject()呼叫speak(), 故要轉型Animal
			}
		} catch (EOFException e) {
			System.out.println();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		ois.close();
		fis.close();
	}
}
