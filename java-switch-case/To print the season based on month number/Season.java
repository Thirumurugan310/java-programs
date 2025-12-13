import java.util.*;
public class Season
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    char week;
	    if(n>0 || n<5){
	        week = 'a';
	    }else if(n>=5 || n<=8){
	        week = 'b';
	    }else{
	       week = 'c';
	    }
	    switch(week){
	        case 'a':
	            System.out.println("Sunny");
	        break;
	        case 'b':
	            System.out.println("Rainy");
	        break;
	        case 'c':
	            System.out.println("Winter");
	        break;
	        default:
	            System.out.println("Out of month");
	    }
	}
}
