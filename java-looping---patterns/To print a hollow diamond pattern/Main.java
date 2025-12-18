import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i = 1;i <= n;i++){
	        for(int j = 1;j <= n-i;j++){
	            System.out.print(" ");
	        }for(int k = 1;k <= i*2-1;k++){
	            if(i==1  || k==1 || k==i*2-1)System.out.print("*");
	            else System.out.print(" ");
	        }System.out.println();
	    }
	    for(int i = 1;i < n;i++){
	        for(int j = 1;j <= i;j++){
	            System.out.print(" ");
	        }for(int k = 1;k < n*2-i*2;k++){
	             if(i==n-1  || k==1 || k==n*2-i*2-1)System.out.print("*");
	            else System.out.print(" ");
	        }System.out.println();
	    }
   }
}