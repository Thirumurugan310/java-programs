import java.util.Scanner;
public class Bit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n&=1;
	    if(n==0) {
			System.out.println("Even");
		}else{
		    System.out.println("Odd");
		}
	}
}
