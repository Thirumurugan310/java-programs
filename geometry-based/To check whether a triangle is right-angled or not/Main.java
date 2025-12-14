import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int aa = (a>b)?a:b;
        aa = (a>c)?a:c;
        if(Math.sqrt()){
            System.out.println("equilateral");
        }
        else if(a==b||b==c||c==a){
            System.out.println("isocelus");
        }
        else{
            System.out.println("scalance");
        }
    }
}