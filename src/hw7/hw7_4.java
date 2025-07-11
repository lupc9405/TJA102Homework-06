package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
	請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。
	注意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
 */

public class hw7_4  { // 實作空介面

	public static void main(String[] args) throws IOException {
		File dir = new File("C:\\data");
		File file = new File(dir, "Object.ser");
		
		// 判斷資料夾是否存在, 無則建立
		if (!dir.exists()) {
			dir.mkdir(); 
		}
		
		// Dog與Cat類別 分別產生兩個物件
		Animal[] animal = new Animal[4];
		animal[0] = new Cat("Cat1");
		animal[1] = new Cat("Cat2");
		animal[2] = new Dog("Dog3");
		animal[3] = new Dog("Dog4");

		// Animal[] 依序輸出至 Object.ser
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		for (int i = 0; i < animal.length; i++)
			oos.writeObject(animal[i]);

		oos.close();
		fos.close();

	}
}