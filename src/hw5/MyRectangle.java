package hw5;

// 請設計一個類別MyRectangle
public class MyRectangle {
	// 有兩個double型態的屬性為width, depth
	private double width;
	private double depth;
	
	// 3個方法
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	public double getArea() {
		return width * depth;
	}
	
	// 2個建構子
	public MyRectangle() {
		
	}
	
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
}
