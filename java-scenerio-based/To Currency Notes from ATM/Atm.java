import java.util.Scanner;
public class Atm
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int am = sc.nextInt();
		int f = am/500;
		int t = am%500;
		int tw = t/200;
		int h = t%200;
		h/=100;
		System.out.println("500 : "+f+"\n200 : "+tw+"\n100 : "+h);
	}
}
