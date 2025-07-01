package hw5;

public class AuthCode {
	// static 方法，A~Z,a~z,0~9傳入陣列迴圈
	public char[] unicodeArray() {
		char[] unicodeArray = new char[62]; // A~Z,a~z,0~9陣列
		int countIndex = 0;// count index值

		// 加入 A ~ Z
		for (char c = 'A'; c <= 'Z'; c++) {
			unicodeArray[countIndex++] = c;
		}

		// 加入 a ~ z
		for (char c = 'a'; c <= 'z'; c++) {
			unicodeArray[countIndex++] = c;
		}

		// 加入 0 ~ 9
		for (char c = '0'; c <= '9'; c++) {
			unicodeArray[countIndex++] = c;
		}

		return unicodeArray;
	}
	

	// genAuthCode()方法，產生8個亂數
	public String genAuthCode() {
		char[] randomIndex= new char[8];
		char [] pool = unicodeArray();
		for (int i = 0; i < 8; i++) {
			randomIndex[i] = pool[(int) (Math.random() * 62)];
		}
		String str = new String(randomIndex);
		return str;
	}
}
