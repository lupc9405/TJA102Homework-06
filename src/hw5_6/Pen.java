package hw5_6;

// 建立父類別
public abstract class Pen {
	// 實體變數: 2個屬性
	private String brand; // 品牌
	protected double price; //價格(定價)
	
	// 建構子: 2個建構子
	public Pen() {
		
	}
	
	public Pen(String brand,double price) {
		this.brand = brand;
		this.price = price;
	}
	
	// 定義getter/setter方法
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	//宣告抽象方法write()
	public abstract void write();
}
