import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    boolean flag = true;
	    for(int i=2;i<a;i++){
	        if(a%i==0 && a!=i)flag=false;
	    }
	    if(flag==true)System.out.println("Prime number");
	    else System.out.println("Not");
	}
}
