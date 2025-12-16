import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int aa = a;
	    int bb = b;
	    while(b!=0){
	        int c = b;
	        b = a%b;
	        a = c;
	    }
	    
	    System.out.println(a);
	}
}
