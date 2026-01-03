import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
	    for(int j = 0;j < m;j++){
	        int min = Integer.MAX_VALUE;
	        for(int i = 0;i < n;i++){
	            arr[i][j] = sc.nextInt();
	            if(min>arr[i][j])min = arr[i][j];
	        }System.out.println(j+1+" Column Min Value : "+min);
	    }
	    
	}
}
