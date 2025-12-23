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
		for(int i = 0;i < n-k;i++){
		    int last = arr[n-1];
		    for(int j = n-1;j > 0;j--){
		        arr[j] = arr[j-1];
		    }
		    arr[0] = last;
		}
		for(int i = 0 ;i < n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
