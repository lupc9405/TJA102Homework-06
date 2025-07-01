package hw5;

public class RandomAverage {
	// 實體變數
	int[] randomTen = new int[10]; // 亂數陣列, 長度為10
	double avg; // 平均值

	// 取得值
	public double getAvg() {
		return avg;
	}

	public int[] getRandomTen() {
		return randomTen;
	}

	// 設計randAvg方法
	public void randAvg() {
		avg = 0; // 歸零
		
		// 產生10個0~100的亂數
		for (int i = 0; i < randomTen.length; i++) {
			randomTen[i] = (int) (Math.random() * 101);
			System.out.print(randomTen[i] + " ");
			// 計算10組數字的平均
			avg += randomTen[i];
		}
		System.out.println();
		System.out.print(avg / randomTen.length);
	}
}
