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
		int count = 0,nnn = 0,m = 0;
		for(int i = 0;i < n;i++){
		    if(nn==arr[i] && count!=1){
		        m = i;
		        System.out.println("First Occurance :"+i);
		        count++;
		    }else if(nn==arr[i]){
		        nnn = i;
		        flag = false;
		    }
		}
		      if(flag==false)System.out.println("last Occurance :"+nnn);
		      else if(nn==arr[m])System.out.println("last Occurance :"+m);
		      else System.out.println("First and Last Occurance not found");
	}
}
