import java.util.*;
public class Artcal
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char choice = sc.next().charAt(0);
		int b = sc.nextInt();
		switch(choice){
		    case '+':
		        System.out.println(a+b);
		    break;
		    case '-':
		        System.out.println(a-b);
		    break;
		    case '/':
		        System.out.println(a/b);
		    break;
		    case '*':
		        System.out.println(a*b);
		    break;
		    case '%':
		        System.out.println(a%b);
		    break;
		}
		
	}
}
