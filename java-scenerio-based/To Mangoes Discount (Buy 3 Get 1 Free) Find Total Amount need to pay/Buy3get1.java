import java.util.Scanner;
public class Buy3get1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mango = sc.nextInt();
		double price = sc.nextDouble();
		int dis = mango/4;
		mango-=dis;
		System.out.println(mango*price);
	}
}
