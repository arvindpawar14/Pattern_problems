package Pattern;

public class InvertedHalfPerimid {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			//inner Loop
			for(int j=1; j<=4-i; j++) {
				System.out.print(" ");
			}
			//inner For Loops
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
