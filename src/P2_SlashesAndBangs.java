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
0    \=0   !=22
1    \=4   !=18
2    \=8   !=14
3    \=12  !=10
4    \=18  !=6
5    \=20  !=2

*/

/* 3. Using your analysis from above, in pseudocode describe the algorithm for how to draw the figure
 print slashes 2 * row
 print bangs = 22 - slashes
 print slashes 2 * row
 println
 
 
 
 
 
 */

public class P2_SlashesAndBangs {

	public static void main(String[] args) {
		
	  for (int row = 0 - 5; row = <6 row++); {
		int countOfSlashes = row * 2;
		int countOfbangs = 22 -(2*countOfSlashes);
		
			 
			for (int i = 0; i < countOfSlashes; i++) {
				System.out.print("\\");
			}
			for (int i = 0; i < countOfbangs; i++) {
				System.out.print("!");
			}
			for (int i = 0; i < countOfSlashes; i++) {
				System.out.print("\\");
			}
				
			System.out.println("");
		}
}
}