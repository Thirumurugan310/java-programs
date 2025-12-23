import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 1,a = 0;
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
            for(int j = 0;j < n-1;j++){
                if(arr[j]==arr[j+1]-1)count++;
                else if(arr[j]!=arr[j-1])count = 1;
                if(count>a)a=count;
            }
        if(count!=1)System.out.print(count);
        else System.out.print("No continue");
    }
}