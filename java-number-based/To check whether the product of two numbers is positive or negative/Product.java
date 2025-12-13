import java.util.*;
public class Product
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if((n*m)>=0){
		    System.out.println("Positive");
		}else{
		    System.out.println("Negative");
		}
	}
}
