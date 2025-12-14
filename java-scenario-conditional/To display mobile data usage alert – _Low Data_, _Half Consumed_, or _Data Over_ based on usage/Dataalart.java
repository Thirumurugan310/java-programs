import java.util.*;
public class Dataalart
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double t = sc.nextDouble();
		double c = sc.nextDouble();
		double a = c/t;
		if(c>t){
		    System.out.println("wrong value");
		}else if(a*100<=25){
		    System.out.println("low");
		}else if(a*100<50){
		    System.out.println("more than 50% over");
		}else if(a*100==50){
		    System.out.println("50% over");
		}else if(a*100<100){
		    System.out.println("have more than 50%");
		}else if(a*100==100){
		    System.out.println("Not used yet");
		}else if(a*100==0){
		    System.out.println("Data over");
		}
	}
}
