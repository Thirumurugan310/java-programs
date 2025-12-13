import java.util.Scanner;
public class Cube
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int per = 12*a;
	    int area = 6*(int)Math.pow(a,2);
	    int vol = (int)Math.pow(a,3);
		System.out.println(per+"\n"+area+"\n"+vol);
	}
}
