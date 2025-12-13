import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int mt=sc.nextInt();
        int yr=sc.nextInt();
        if(mt>12){
            System.out.println("conndition not satisfied");
        }
        else if(mt%2!=0){
            System.out.println("31");
        }
        else if(yr%4==0&&mt==2){
            System.out.println("29");
             }
        else if(yr%4!=0&&mt==2){
            System.out.println("28");
        }
            
        else{
            System.out.println("30");
        }
    }
}