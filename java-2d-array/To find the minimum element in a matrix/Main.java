import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int[][] arr = new int[n][m];
	    for(int i = 0;i < n;i++){
	        for(int j = 0;j < m;j++){
	            arr[i][j] = sc.nextInt();
	            if(min>arr[i][j])min = arr[i][j];
	        }
	    }System.out.print("MIN : "+min);
	    
	}
}
