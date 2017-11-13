/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/* 2. Create a table below (just using text) that outlines your analysis of the figure. That is, how many
 * of each character on each line? What expression captures the relationship between the line number and
 * how many of the character is printed on each line? Choose your headings based on how you can break down
 * the figure.
  
Line Number		| HEADING		| HEADING		| HEADING		| HEADING		| HEADING		|	





*/

/* 3. Using your analysis from above, in pseudocode describe the algorithm for how to draw the figure
 
 
 
 
 
 */

public class P2_SlashesAndBangs {

	public static void main(String[] args) {

		int hight = 7;
		for (int i = 0; i <= hight; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("\\");
			}
			int count = (hight - i) * 2 + 1;
			for (int k = 0; k < count; k++) {
				System.out.print("!");
			}
			int back = (count + i) * 2 + 1;
			for (int c = 0; c < back; c++) {
				System.out.print("\\");
			}
			System.out.println("");
		}
	}

}
