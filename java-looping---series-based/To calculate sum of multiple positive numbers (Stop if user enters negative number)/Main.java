import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int sum = 0;
	    
	    while(true){
	        int n = sc.nextInt();
	        if(n>=0){
	            sum += n;
	        }else{
	            System.out.println(sum);
	            return ;
	        }
	        
	    }
	}
}
