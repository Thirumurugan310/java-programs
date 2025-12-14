import java.util.*;
public class Waterbill{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int i;
		int j;
		if(l%1000 != 0){
		    i = l%1000;
		    j = l-i;
		    if(j>=0 && j<=1000){
		        System.out.println("Free");
	    	}
		    else if(j>1000 && j<=3000){
		        System.out.println(5 + " balance " + i + " litter bending");
		    }
	    	else if(j>3000){
	    	  System.out.println(((l-1000)/1000)*10 + " balance " + i + " litter bending");
	    	}
		}
		else{
		    if(l>=0 && l<=1000){
	    	    System.out.println("Free");
	    	}
	    	else if(l>1000 && l<=3000){
	       	    System.out.println(5);
	    	}
    		else if(l>3000){
	    	    System.out.println(((l-1000)/1000)*10);
    		}
		}
	}
}
