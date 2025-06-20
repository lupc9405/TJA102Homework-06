package hw3;
import java.util.Scanner;
public class hw3_3 {
	public static void main(String[] args) {
		// 3. 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字,
		// 請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數
		// 進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複
		Scanner input = new Scanner(System.in);
		System.out.println("阿文... 請輸入你討厭哪個數字？");
		int inputNumber = input.nextInt();
		int[] lottery = new int[49];
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if ((i / 10) % 10 != inputNumber && i % 10 != inputNumber) {
				if (count % 6 == 0) {
					System.out.println();
				}
				lottery[count] = i;
				System.out.print(lottery[count] + "\t");
				count++;
			}
		}
		System.out.println("總共有" + count + "數字可選");
		System.out.println("===================================");
		System.out.println("隨機選號(不重複): ");
		int[] randomPick = new int[6];
		int num;
		for (int i = 0; i < randomPick.length; i++) {
			boolean run = true; // while迴圈的控制條件
			while (run) {
				num = lottery[(int) (Math.random() * count)];
				if (num != 0) {
					boolean check = false; // 預設沒重複(false)
					for (int j = 0; j < i; j++) {
						if (randomPick[j] == num) {
							check = true; // 找到有重複(true), 離開for迴圈
							break;
						}
					}
					if (check == false) { // 沒重複(false)才加進陣列
						randomPick[i] = num;
						run = false; // 離開while迴圈
					}
				}
			}
			System.out.print(randomPick[i] + "\t");
		}
	}
}
