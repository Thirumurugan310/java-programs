import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int expected = 1;
        for(int i = 0; i < n; i++){
            if(arr[i] == expected){
                expected++;
            }
        }
        System.out.print(expected);
    }
}
