import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            int num = i;
            while(num > 9){
                int temp = num;
                int sum = 0;

                while(temp != 0){
                    sum += temp % 10;
                    temp /= 10;
                }
                num = sum;
            }
            if(num == 1)
                System.out.print(i + " ");
        }
    }
}
