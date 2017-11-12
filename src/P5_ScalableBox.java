

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P5_ScalableBox {

	public static void main(String[] args) {
		drawBoxCap();
		drawBoxInsides();
		drawBoxCap();
	}
	
	public static void drawBoxCap() {
		System.out.print("+");
		int i = 20;
		for( int capDashIndex = 1; capDashIndex <= i - 2; capDashIndex++ ) {
			System.out.print("-");
		}
		
		System.out.println("+");
	}
	
	public static void drawBoxInsides() {
		int c = 10;
		for( int insideRowIndex = 1; insideRowIndex <= c  - 2; insideRowIndex++ ) {
			drawBoxInsideLine();
		}
	}
	
	public static void drawBoxInsideLine() {
		System.out.print("|");
		int b = 20;
		for( int insideRowIndex = 1; insideRowIndex <= b  - 2; insideRowIndex++ ) {
			System.out.print(".");
		}
		
		System.out.println("|");
	}

}
