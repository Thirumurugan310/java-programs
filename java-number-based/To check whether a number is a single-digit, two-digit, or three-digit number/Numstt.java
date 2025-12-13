import java.util.*;
public class Numstt
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=0 && 10>n){
		    System.out.println("Single-dig");
		}else if(n>=10 && 100>n){
		    System.out.println("Two-dig");
		}else if(n>=100 && 1000>n){
		    System.out.println("Three-dig");
		}else{
		    System.out.println("Above Three-dig");
		}
	}
}
