package thing;
import java.util.Scanner;
public class romanNumerals {
	public static String romanDigit(int n, String one, String five, String ten){
		String num = "";
		switch(n){
		case 1:
			num += one;
			break;
		case 2:
			num += one + one;
			break;
		case 3:
			num += one + one + one;
			break;
		case 4:
			num += one + five;
			break;
		case 5:
			num += five;
			break;
		case 6:
			num += five + one;
			break;
		case 7:
			num += five + one + one;
			break;
		case 8:
			num += five + one + one + one;
			break;
		case 9:
			num += one + ten;
			break;
		}
		return num;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number");
		int num = in.nextInt();
		String romanOnes = romanDigit( num%10, "I", "V", "X");
		num = num/10;
		String romanTen = romanDigit( num%10, "X", "L", "C");
		num = num/10;
		String romanHundred = romanDigit( num%10, "C", "D", "M");
		System.out.println(romanHundred + romanTen + romanOnes);
	}
}
