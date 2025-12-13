import java.util.Scanner;
public class Tdig
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    if(100<=n && 999>=n){
	        System.out.println("3dig");
	    }else{
	        System.out.println("Not");
	    }
	}
}
