//This should be able to solve J3 as seen in Instructions.pdf.

import java.util.Scanner;

/**
 *
 * @author SPH_SHSM
 */
public class FixMe {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//Read in a number
		int Lines = in.nextInt();
		in.nextLine();
		String output = "";
		// Loop through the lines
		for (int j = 0; j < Lines; j++) {
			// Read in a string
			String input = in.nextLine();
			// Loop through the characters

			char currentChar = 'A';
			int currentCount = '0';
			char previousChar = 0;
			for (char i = 0; i < input.length(); i++) {
				// if this is the first pass through the loop
				if (i == 0) {
					// current char is the char at j
					currentChar = input.charAt(i);
					// current count = 1
					currentCount = 1;
				}
				// else
				else
					// set previousChar to currentChar
					previousChar = currentChar;
				// current character = charAt(i)
				currentChar = input.charAt(i);
				// if the current and previous char are the same
				if (currentChar == previousChar) {
					// increase the count
					currentCount++;
				}
				// else
				else {
					// print current count + " " + previousChar
					output += currentCount + " " + previousChar + " ";
					// currentCount = 1
					currentCount = 1;
				}
				// If we're on the last character
				if (i == input.length() - 1) {
					// add the count to the output
					output += currentCount + " " + currentChar + " ";
				}

			}
		}
		// Print newline
		output += "\n";
		// Print the result
		System.out.println(output);
	}
	
}
