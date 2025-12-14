import java.util.*;
public class Ebbill
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    if(a<=100) {
	        System.out.println("Free");
	    }else if(a>100 && a<=300) {
	        System.out.println((a-100)*5);
	    }else if(a>300 && a<=500) {
	        System.out.println((a-100)*10);
	    }else {
	        System.out.println((a-100)*10+100);
	    }
	}
}