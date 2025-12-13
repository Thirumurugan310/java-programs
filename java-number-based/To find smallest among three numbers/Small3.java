import java.util.Scanner;
public class Great3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
        int o = sc.nextInt();
		if(n<m && o>n) {
			System.out.println(n);
		} else if(m>o && n>o) {
			System.out.println(o);
		}else{
		    System.out.println(m);
		}
	}
}
