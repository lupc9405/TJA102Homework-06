package hw2;

public class hw2 {
	public static void main(String[] args) {
		// 1.請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1～1000的偶數和 = " + sum);

		System.out.println();
		// 2.請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		int sum1 = 1;
		for (int i = 1; i <= 10; i++) {
			sum1 *= i;
		}
		System.out.println("1～10的連乘積(用for迴圈) = " + sum1);

		System.out.println();
		// 3.請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int sum2 = 1;
		int num = 1;
		while (num <= 10) {
			sum2 *= num;
			num++;
		}
		System.out.println("1～10的連乘積(用while迴圈) = " + sum2);

		System.out.println();
		// 4.請設計一隻Java程式，輸出結果為以下：
		// 1 4 9 16 25 36 49 64 81 100
		
		int num1=1;
		while (num1 <=10) {
			System.out.print((int)Math.pow(num1, 2) + " ");
			num1++;
		}
		System.out.println();

		System.out.println();
		// 5.阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int count = 0;
		System.out.print("阿文可以選擇: ");
		for (int i = 1; i < 50; i++) {
			if ((i /10) % 10 != 4 && i % 10 != 4) {
				System.out.print(i + " ");
				count +=1;
			}
		}
		System.out.println();
		System.out.println("總共有: "+count+"個");

		System.out.println();
		// 6.請設計一隻Java程式，輸出結果為以下：
		// 1 2 3 4 5 6 7 8 9 10
		// 1 2 3 4 5 6 7 8 9
		// 1 2 3 4 5 6 7 8
		// 1 2 3 4 5 6 7
		// 1 2 3 4 5 6
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1
		
		for (int i1 = 1; i1 <= 10; i1++) {
			for (int j1 = 1; j1 <= 11 - i1; j1++) {
				System.out.print(j1 + " ");
			}
			System.out.println();
		}

		System.out.println();
		// 7. 請設計一隻Java程式，輸出結果為以下：
		// A
		// BB
		// CCC
		// DDDD
		// EEEEE
		// FFFFFF
		char char1 = 'A';
		for (int i1 = 1; i1 <= 6; i1++) {
			for (int j1 = 0; j1 < i1; j1++) {
				System.out.print(char1);
			}
			char1++;
			System.out.println();
		}

	}
}
