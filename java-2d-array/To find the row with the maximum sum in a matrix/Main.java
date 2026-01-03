import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int[][] arr = new int[n][m];
	    for(int i = 0;i < n;i++){
	        int sum = 0;
	        for(int j = 0;j < m;j++){
	            arr[i][j] = sc.nextInt();
	            sum+=arr[i][j];
	        }if(max<sum)max = sum;
	    }
	    System.out.print("Row with Maximum Sum : "+max);
	}
}
