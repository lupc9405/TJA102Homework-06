package hw4;

public class hw4_2 {

	public static void main(String[] args) {
		// 2. 請建立一個字串，經過程式執行後，輸入結果是反過來的
		// 例如String s = “Hello World”，執行結果即為dlroW olleH
		// (提示：String方法，陣列)
		
		String s = "Hello Whorld";

		// 原寫法
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

		System.out.println();
		
		// 使用陣列的寫法
		// 迴圈帶入字串到陣列
		String[] str = new String[s.length()];
		for (int i = 0; i < str.length; i++) {
			str[i] = s.charAt(i) + ""; // char加字串會變字串
		}
		// 迴圈反向輸出
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i]);
		}
		

	}

}
