import java.util.*;
public class Valid 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x>=0 && y>=0){
		    System.out.println("I Quadrant");
		}else if(x<0 && y>=0){
		    System.out.println("II Quadrant");
		}else if(x<0 && y<0){
		    System.out.println("III Quadrant");
		}else if(x>=0 && y<0){
		    System.out.println("IV Quadrant");
		}else{
		    System.out.println("Invalid");
		}
	}
}
