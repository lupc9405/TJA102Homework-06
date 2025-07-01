package hw4;

import java.util.Arrays;

public class hw4_6 {

	public static void main(String[] args) {
		// 6. 班上有8位同學，他們進行了6次考試結果如下：
		// no| 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 |
		// 1 | 10 | 35 | 40 |100 | 90 | 85 | 75 | 70 |
		// 2 | 37 | 75 | 77 | 89 | 64 | 75 | 70 | 95 |
		// 3 |100 | 70 | 79 | 90 | 75 | 70 | 79 | 90 |
		// 4 | 77 | 95 | 70 | 89 | 60 | 75 | 85 | 89 |
		// 5 | 98 | 70 | 89 | 90 | 75 | 90 | 89 | 90 |
		// 6 | 90 | 80 |100 | 75 | 50 | 20 | 99 | 75 |
		// 請算出每位同學考最高分的次數
		// (提示：二維陣列)

		// 成績
		int[][] score = new int[][] { 
			{ 10, 35, 40, 100, 90, 85, 75, 70 },
			{ 37, 75, 77, 89, 64, 75, 70, 95 },
			{ 100, 70, 79, 90, 75, 70, 79, 90 },
			{ 77, 95, 70, 89, 60, 75, 85, 89 },
			{ 98, 70, 89, 90, 75, 90, 89, 90 },
			{ 90, 80, 100, 75, 50, 20, 99, 75 } 
			};

		// 找出每場考試的最高分數
		int[] scoreMax = new int[6];

		for (int i = 0; i < score.length; i++) {
			int[] scoreCopy = Arrays.copyOf(score[i], score[i].length);
			Arrays.sort(scoreCopy);
			scoreMax[i] = scoreCopy[scoreCopy.length - 1];
		}

		// 找出學生每場考試得最高分的次數
		int[] stuCount = new int[8];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				if (score[i][j] == scoreMax[i]) {
					stuCount[j]++;
				}
			}
		}

		// 輸出結果
		for (int i = 0; i < stuCount.length; i++) {
			System.out.println((i + 1) + "號同學最高分次數: " + stuCount[i]);
		}

	}

}
