import java.util.*;
public class Discountfor
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    if(a>=500 && a<1000) {
	        System.out.println(a-40);
	    }else if(a>=1000 && a<2000) {
	        System.out.println(a-100);
	    }else if(a>=2000 && a<5000) {
	        System.out.println(a-250);
	    }else if(a>=5000) {
	        System.out.println(a-500);
	    }else {
	        System.out.println(a);
	    }
	}
}
