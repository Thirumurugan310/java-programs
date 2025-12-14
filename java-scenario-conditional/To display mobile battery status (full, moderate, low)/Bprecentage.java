import java.util.*;
public class Bprecentage{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		if(b>0 && b<=20){
		    System.out.println("Low");
		}else if(b>20 && b<100){
		     System.out.println("Moderate");
		}else if(b==100){
		     System.out.println("Full");
		}else if(b>100){
		     System.out.println("Invalid");
		}
	}
}
