import java.util.Scanner;
public class Selling
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cost = sc.nextDouble();
		double profit = sc.nextDouble();
		profit = cost*(profit/100.0);
		System.out.println(cost+profit);
	}
}
