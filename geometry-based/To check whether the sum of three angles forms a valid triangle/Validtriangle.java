import java.util.*;
public class Validtriangle
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a+b+c==180){
		    System.out.println("It was a valid triangle");
		}else{
		    System.out.println("It was not a valid triangle");
		}
	}
}
