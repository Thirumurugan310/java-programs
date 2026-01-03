import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
	    for(int i = 0;i < n;i++){
	        for(int j = 0;j < m;j++){
	            arr[i][j] = sc.nextInt();
	            
	        }
	    }
	    boolean flag = true;
	    for(int i = 0;i < n;i++){
	        for(int j = 0;j < m;j++){
	            if(arr[i][j]!=arr[j][i])flag = false;
	        }
	    }if(flag)System.out.print("Symmetric Matrix");
	     else System.out.print("Not a Symmetric");
	}
}