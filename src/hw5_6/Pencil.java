package hw5_6;

// 建立子類別Pencil 繼承Pen父類別
public class Pencil extends Pen {

	public Pencil(String brand, double price) {
		super(brand, price); // 傳入定價
	}

	@Override
	// Pencil實際售價為定價8折
	public double getPrice() {
		return super.getPrice() * 0.8; // 實際售價
	}

	@Override
	//  實作方法：Pencil輸出為削鉛筆再寫
	public void write() {
		System.out.println("削鉛筆再寫");
	}
}
