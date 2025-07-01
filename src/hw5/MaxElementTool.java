package hw5;

public class MaxElementTool {

	// 設計int maxElement(int x[][])方法
	public int maxElement(int x[][]) {
		// 找出最大值
		int max = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) 
					max = x[i][j];
			}
		}
		return max;
	}
	
	// 設計double maxElement(double x[][])方法
	public double maxElement(double x[][]) {
		// 找出最大值
		double max = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) 
					max = x[i][j];
			}
		}
		return max;
	}
}
