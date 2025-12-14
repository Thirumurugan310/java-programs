import java.util.*;
public class Weakt{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Sunday = 1\nMonday = 2\nTuesday = 3\nWednesday = 4\nThersday = 5\nFriday = 6\nSaterday = 7\nEnter your choice :");
		int day = sc.nextInt();
		if(day == 2 || day == 3 || day == 4 || day == 5 || day == 6){
		    System.out.println(800);
		}
		else if(day == 7 || day == 1 ){
		    System.out.println(1000);
		}
		else{
		    System.out.println("invalid choice");
		}
	}
}
