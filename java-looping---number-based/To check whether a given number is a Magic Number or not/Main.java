import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    while(n>9){
	      int temp = n;
	      n = 0;
	    while(temp!=0){
	        int temp1=temp%10;
	        n+=temp1;
	        temp/=10;
	        }
	    }
	    if(n==1)System.out.println("Magic Number");
	    else System.out.println("Not");
	}
}
