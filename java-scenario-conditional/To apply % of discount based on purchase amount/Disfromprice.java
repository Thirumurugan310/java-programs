import java.util.*;
public class Disfromprice{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double t = sc.nextDouble();
		double d = 0;
		double a = 0;
		if(t<500){
		    d = 2;
		}else if(t>=500 && t<1000){
		     d = 4;
		}else if(t>=1000 && t<1500){
		     d = 6;
		}else if(t>=1500 && t<2000){
		     d = 8;
		}else if(t>=2000 && t<3000){
		     d = 10;
		}else if(t>=3000 && t<5000){
		     d = 12;
		}else if(t>=5000){
		     d = 15;
		}
		a = ((double)d/100)*t;
		double n = t-a;
		System.out.println("Your discount % is " + d + " % " + "\nYou have to pay " + n + "rps");
	}
}
