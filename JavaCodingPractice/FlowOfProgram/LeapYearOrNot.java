package FlowOfProgram;
import java.util.Scanner;
public class LeapYearOrNot {
	//input a year and find whether it is leap year or not 
	public static void main(String[] args) {
		// int year=2000;
		Scanner input= new Scanner(System.in);
		System.out.print("Enter year which you want to checked:");
		int year=input.nextInt();
		if (year % 4 ==0) {
			System.out.println("This is leap year "+ year);
		}else {
			System.out.println("This is not leap year "+ year); 
		}
		input.close();
	}
}