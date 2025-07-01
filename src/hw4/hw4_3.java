package hw4;
public class hw4_3 {

	public static void main(String[] args) {
		// 有個字串陣列如下(八大行星)：{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”,
		// “uranus”, “neptune”}
		// 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		// (提示：字元比對，String方法)

		String[] planets = new String[] { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus",
				"neptune" };
		int vowelsCount = 0;

		for (int i = 0; i < planets.length; i++) {
			for (int j = 0; j < planets[i].length(); j++) {
				switch (planets[i].charAt(j)) {
				case 'a':
					vowelsCount++;
					break;
				case 'e':
					vowelsCount++;
					break;
				case 'i':
					vowelsCount++;
					break;
				case 'o':
					vowelsCount++;
					break;
				case 'u':
					vowelsCount++;
					break;
				}
			}
		}
		System.out.println("共有" + vowelsCount + "個母音");
	}
}
