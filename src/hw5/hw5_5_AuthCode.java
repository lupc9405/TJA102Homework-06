package hw5;
/*
 * 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，
 * 請設計一個方法genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，
 * 此驗證碼內容包含了英文大小寫與數字的亂數組合
 * */
public class hw5_5_AuthCode {

	public static void main(String[] args) {

		// 建立物件
		AuthCode authCode = new AuthCode();
		
		System.out.println("本次隨機產生驗證碼為: ");
		
		// 呼叫genAuthCode()方法回傳8位數驗證碼
		System.out.println(authCode.genAuthCode());
		
	}

}
