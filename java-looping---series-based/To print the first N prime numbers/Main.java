import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int num = 2;
	    int count = 0;
	    
	    while(count<n){
	        boolean flag = true;
	        for(int i = 2;i < num;i++){
	            if(num%i==0){
	                flag = false;
	                break;
	            }
	        }
	        if(flag==true){
	            System.out.print(num+" ");
	            count++;
	        }
	        num++;
	    }
	}
}
