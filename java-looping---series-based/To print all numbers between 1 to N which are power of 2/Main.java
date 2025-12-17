import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i <= n;i++){
            int k = i;
            while(k%2==0){
                k/=2;
            }if(k==1)System.out.print(i+" ");
        }
    }
}
