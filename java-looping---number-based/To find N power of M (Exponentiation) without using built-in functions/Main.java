import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double n = sc.nextDouble();
	    int m = sc.nextInt();
	    int sum = 1;
	    for(int i =0;i<m;i++){
	        sum *=n;
	    }
	    System.out.println(sum);
	}
}
