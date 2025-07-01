package hw5;
/*
 * 利用Overloading，設計兩個方法： int maxElement(int x[][]) double maxElement(double
 * x[][]) 可以找出二維陣列的最大值並回傳
 */

public class hw5_3_MaxElementTool {

	public static void main(String[] args) {
		MaxElementTool maxElementTool = new MaxElementTool();
		
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 3 } };

		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

		System.out.println(maxElementTool.maxElement(intArray));
		System.out.println(maxElementTool.maxElement(doubleArray));
	}
}
