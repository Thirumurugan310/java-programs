import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1;i <= n;i++){
		    for(int j = 1;j <= i-1;j++){
		        System.out.print(" ");
		    }for(int k = 0;k <= 2*n-2*i;k++){
		        if(k==0 || i==1 || k==2*n-2*i || i==n)System.out.print("*");
		        else System.out.print(" ");
		    }
		    System.out.println();
		}
		for(int i = 2;i <= n;i++){
		    for(int j = 1;j < n-i+1;j++){
		        System.out.print(" ");
		    }for(int k = 1;k <= 2*i-1;k++){
		        if(k==1  || k==2*i-1 || i==n)System.out.print("*");
		        else System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}
