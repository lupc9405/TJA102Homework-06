package hw5;
/*
 * 請設計一個方法為randAvg()
 * 從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
 * */

public class hw5_2_RandomAverage {

	public static void main(String[] args) {
		// 建立物件
		RandomAverage randomAverage = new RandomAverage();
		
		System.out.println("本次亂數結果: ");
		// 呼叫randAvg()方法
		randomAverage.randAvg();
	}
}
