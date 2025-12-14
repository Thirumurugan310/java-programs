import java.util.*;
public class Battery
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    if(a<=20) {
	        System.out.println("Low Battery");
	    }else if(a>20 && a<50) {
	        System.out.println("Modrate");
	    }else if(a>50 && a<100) {
	        System.out.println("Performance mode");
	    }else if(a==50) {
	        System.out.println("50% Consumed");
	    }else if(a==100) {
	        System.out.println("Full Battery");
	    }
	}
}