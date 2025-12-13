import java.util.*;
public class Ascii
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(((int)ch)%2==0){
		    System.out.println("Even");
		}else{
		    System.out.println("Odd");
		}
	}
}
