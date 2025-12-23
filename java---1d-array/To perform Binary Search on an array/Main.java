import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++){
		    arr[i] = sc.nextInt();
		}
		int nn = sc.nextInt();
		boolean flag = true;
		for(int i = 0;i < n;i++){
		    if(arr[i]==nn){
		        nn = i;
		        flag = false;
		        break;
		    }
		}
		        if(flag==false)System.out.print(nn);
		        else System.out.print("Not found");
		    
	}
}
