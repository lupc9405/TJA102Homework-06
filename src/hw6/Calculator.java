package hw6;

public class Calculator {
	int x;
	int y;

	int powerXY(int x, int y)  throws CalException {
		if (y == 0 && x == 0) {
			throw new CalException("0的0次方沒有意義！");
		} else if (y < 0) {
			throw new CalException("次方為負值，回傳結果不為整數！");
		} else {
			//System.out.println(x + "的" + y + "次方等於" + c.powerXY(x, y));
			return (int) Math.pow(x, y);
		
		}

	}
}
