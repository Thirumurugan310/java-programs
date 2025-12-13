import java.util.Scanner;
public class Buy5get2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pen = sc.nextInt();
		double price = sc.nextDouble();
		int dis = pen/5;
		pen = pen-dis-dis;
		System.out.println(pen*price);
	}
}
