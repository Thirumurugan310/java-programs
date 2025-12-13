import java.util.Scanner;
public class Salary
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double basesalary = sc.nextDouble();
		double hra = basesalary*(20/100.0);
		double da = basesalary*(50/100.0);
		System.out.println(basesalary+hra+da);
	}
}
