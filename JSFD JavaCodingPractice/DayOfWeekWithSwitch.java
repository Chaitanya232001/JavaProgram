//DayOfWeek program by using Switch 
import java.util.Scanner;
public class DayOfWeekWithSwitch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to display Day?:");
		int day = scan.nextInt();
		switch (day) {
			case 1:
				System.out.println("monday");
				break;
			case 2:
				System.out.println("Tuesaday");
				break;
			case 3:
				System.out.println("wed");
				break;
			case 4:
				System.out.println("thu");
				break;
			case 5:
				System.out.println("fri");
				break;
			case 6:
				System.out.println("sat");
				break;
			case 7:
				System.out.println("sun");
				break;

			default:
				System.out.println("Invalid Choice");
		}
		scan.close();
	}
}
