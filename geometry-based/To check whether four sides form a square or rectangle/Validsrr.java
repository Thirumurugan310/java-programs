import java.util.*;
public class Validsrr
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if(a==b && b==c && c==d && d==a){
		    System.out.println("It was a Sqare");
		}else if(a==c && b==d && a!=b && b!=c && a!=d && c!=d){
		    System.out.println("It was a Rectangle");
		}else{
		    System.out.println("It was not a valid Sqare and Rectangle");
		}
	}
}
