package hw5_6;

// 建立子類別InkBrush 繼承Pen父類別
public class InkBrush extends Pen {

	public InkBrush(String brand, double price) {
		super(brand, price); // 傳入定價
	}

	@Override
	// InkBrush實際售價為定價9折
	public double getPrice() {
		return super.getPrice() * 0.9; // 實際售價
	}

	@Override
	//  實作方法：InkBrush為沾墨汁再寫
	public void write() {
		System.out.println("沾墨汁再寫");
	}
}
