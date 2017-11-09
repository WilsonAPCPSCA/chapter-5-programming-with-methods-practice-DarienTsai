package thing;
import java.util.Scanner;
public class timeReport {
	//@param an integer for hours and an integer for minutes
	public static String getTimeName(int hours, int minutes){
		//variables for return
		String hour = "";
		String min = "-something";
		//hours translation
		switch (hours){
		case 1:
			hour = "one";
			break;
		case 2:
			hour = "two";
			break;
		case 3:
			hour = "three";
			break;
		case 4:
			hour = "four";
			break;
		case 5:
			hour = "five";
			break;
		case 6:
			hour = "six";
			break;
		case 7:
			hour = "seven";
			break;
		case 8:
			hour = "eight";
			break;
		case 9:
			hour = "nine";
			break;
		case 10:
			hour = "ten";
			break;
		case 11:
			hour = "eleven";
			break;
		case 12:
			hour = "twelve";
			break;
		}
		//Certain time stamps from minutes
		switch (minutes){
		case 0:
			min = " O'clock";
			break;
		case 15:
			min = " and a quarter";
			break;
		case 30:
			min = " and a half";
			break;
		case 45:
			min = " and threequarters";
			break;
		}
		//returns full stamp or only hours
		if (min.equals("-something")){
			return hour;
		}
		else{
			return hour+min;
		}
	}
	public static void main(String[] arg){
		//prompts
		System.out.print("please enter the time");
		System.out.println("EX: 4:30 would be four and a half");
		System.out.println("Your time:");
		//io
		Scanner in = new Scanner(System.in);
		int hours = 0;
		int mins = 0;
		String stamp = "";
		//loops time translation
		while(in.hasNext()){
			String time = in.next();
			//tests for a one digit or two digit hour
			if(time.substring(1, 2).equals(":")){
				hours = Integer.parseInt(time.substring(0, 1));
				mins = Integer.parseInt(time.substring(2));
			}
			else if(time.substring(2,3).equals(":")){
				hours = Integer.parseInt(time.substring(0,2));
				mins = Integer.parseInt(time.substring(3));
			}
			else{
				System.out.println("Invalid Input");
			}
			//adds to hours if minutes are over 60
			while (mins > 60 ) {
				mins -= 60;
				hours += 1;
			}
			//get the translation
			stamp = getTimeName(hours, mins);
			//prints, partial stamp return prints hours literal minutes
			//Complete stamp return prints full
			if(stamp.length() < 7){
				System.out.println("It is " + stamp + " O'clock and " + mins + " minutes.");
			}
			else{
				System.out.println("It is " + stamp + ".");
			}
			//prompt for next translation
			System.out.println("Enter next time: ");	
		}
	}
}