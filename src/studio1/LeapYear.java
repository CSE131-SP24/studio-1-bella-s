package studio1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a year: ");
		int year = in.nextInt();
		int condition1 = year%4;
		int condition2 = year%100;
		int condition3 = year%400;
		boolean leapYear = ( ((condition1==0) && (condition2!=0)) || (condition3 == 0));
		System.out.println(year + " is a leap year: " + leapYear);

	}

}