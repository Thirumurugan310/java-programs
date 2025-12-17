import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sum = 0,summ = 0;
	    for(int i = 1;i <= n; i++){
	        if(i%2==0)sum+=i;
	        else summ+=i;
	    }System.out.print("even : "+sum+"\nodd : "+summ);
	}
}
