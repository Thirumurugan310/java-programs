import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double n = sc.nextDouble();
	    if(n==1){System.out.println("Power of three");return;}
	    
	    while(n>3){
	        n = n/3;
	    }
	    if(n==3)System.out.println("Power of three");
	    else System.out.println("not");
	}
}
