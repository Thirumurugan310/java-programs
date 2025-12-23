import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n <= 0) {
            return;
        }

		int[] arr = new int[n];
		for(int i = 0;i < n;i++){
		    arr[i] = sc.nextInt();              //1 2 3 4 5 
		}
		int k = sc.nextInt();  
		for(int i = 0;i < k%n;i++){
		    int first = arr[0];
		    for(int j = 0;j < n-1;j++){
		        arr[j] = arr[j+1];
		    }
		    arr[n-1] = first;
		}
		for(int i = 0 ;i < n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
