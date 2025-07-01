package hw5;

public class hw5_4_MyRectangleMain {

	public static void main(String[] args) {
		// 使用public MyRectangle()建構子建立物件，
		// 設定width, depth為10, 20，透過getArea()印出結果
		MyRectangle re1 = new MyRectangle();
		re1.setWidth(10);
		re1.setDepth(20);
		System.out.println(re1.getArea());
		
		
		// 使用public MyRectangle(double width, double depth)建構子建立物件，
		// 設定width, depth為10, 20，透過getArea()印出結果
		MyRectangle re2 = new MyRectangle(10,20);
		System.out.println(re2.getArea());
		
		
	}
}
