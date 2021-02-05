import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Findday {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Month : ");
		int mm = in.nextInt();
		System.out.println("Enter the Date : ");
		int dd = in.nextInt();
		System.out.println("Enter the Year : ");
		int yy = in.nextInt();
		LocalDate dt = LocalDate.of(yy, mm, dd);
		DayOfWeek s= (dt.getDayOfWeek());
		System.out.print("Then the day is : ");
		System.out.print(s);
	}
} 
