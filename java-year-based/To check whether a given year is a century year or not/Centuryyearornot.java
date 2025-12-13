import java.util.Scanner;
public class Centuryyearornot
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    if(a%100==0) {
	        System.out.println("Century Year");
	    }else {
	        System.out.println("Not Century Year");
	    }
	}
}
