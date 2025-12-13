import java.util.*;
public class Ww
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    char week;
	    if(n>=1 && n<=5){
	        week = 'd';
	    }else if(n==6 || n==7){
	        week = 'e';
	    }else{
	        System.out.println("out of bound");
	        return;
	    }
	    switch(week){
	        case 'd':
	            System.out.println("weekday");
	        break;
	        case 'e':
	            System.out.println("weekend");
	        break;
	    }
	}
}
