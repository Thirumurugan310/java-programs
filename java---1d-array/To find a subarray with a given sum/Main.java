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
		int k = sc.nextInt();                   //5
		int ii = 0,jj = 0,r = 0;
		for(int i = 0;i < n;i++){               
		     r = arr[i];
		    for(int j = i+1;j < n;j++){
		        if(r!=k){
		            r =r+arr[j];
		            ii = i;
		            jj = j;
		        }else break;
		    }if(r==k)break;
		}
		   if(r==k)System.out.print(ii+" to "+jj);
		   else System.out.println("not found");
	}
}
