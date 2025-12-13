import java.util.*;
public class Voco
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		char chh = Character.toLowerCase(ch);
		if(chh=='a' || chh=='e' || chh=='i' || chh=='o' || chh=='u'){
		    System.out.println("Vowels");
		}else{
		    System.out.println("Cosonant");
		}
	}
}
