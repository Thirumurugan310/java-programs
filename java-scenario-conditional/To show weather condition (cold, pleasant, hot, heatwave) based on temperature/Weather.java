import java.util.*;
public class Weather{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		if(w<20){
		    System.out.println("Cold");
		}else if(w>=20 && w<30){
		     System.out.println("Pleasant");
		}else if(w>=30 && w<40){
		     System.out.println("Hot");
		}else if(w>=40){
		     System.out.println("Heatwave");
		}
	}
}
