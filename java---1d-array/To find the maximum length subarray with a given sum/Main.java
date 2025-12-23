import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int[] arr = new int[n];
		for(int i = 0;i < n;i ++){
		    arr[i] = sc.nextInt();
		}
		int finall = sc.nextInt();
		for(int i = 0;i < n;i++){
		    int sum = 0;
		    int count = 0;
		    for(int j = i;j < n;j++){
		        sum+=arr[j];
		        count++;
		        if(sum==finall){
		            int length = j - i + 1;
		            if(length>a){
		                a = length;
		            }
		        }
		    }
		}
		System.out.println(a);
	}
}
