import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        } 
        Arrays.sort(arr);
        int expected = 1;
        int lastMissing = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                if(arr[i] > expected){
                    lastMissing = expected;
                }
                if(arr[i] == expected){
                    expected++;
                }
            }
        }
        if(lastMissing != -1)
            System.out.print(lastMissing);
        else if(expected == 1)
            System.out.print(1);
        else
            System.out.print("No missing positive number");
    }
}
