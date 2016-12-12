/**
 * 
 */
package excersise_nine_eight;
import java.util.Scanner;
/**
 * @author Sergei
 *
 */
public class Exercise_9_8 {
	
	public static void main(String[] args) {
		
		Scanner numb = new Scanner(System.in);
		System.out.print("Enter binary number: ");
		String binaryString = numb.next();
		System.out.println("Decimal Number:" 
			+ binaryString + " is " + bin2Dec(binaryString));
	}

	public static int bin2Dec(String binaryString) {
		int index = 0;
		int n = binaryString.length() - 1;
		int result = 0;
		return bin2Dec(binaryString, index, n, result);
	}
	public static int bin2Dec(String binaryString, int index, int n, int result) {
		result += (Integer.parseInt(binaryString.charAt(index) + "") * 
				(int)Math.pow(2, n));
		if (n == 0) 
			return result;
		else
			return bin2Dec(binaryString, index + 1, n - 1, result); 
	}
}
