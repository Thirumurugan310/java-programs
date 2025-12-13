import java.util.Scanner;
public class Sumoffirstandlast
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = a/100;
	    a%=10;
		System.out.println(a+b);
	}
}
