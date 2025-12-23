import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int j = n-1;
        boolean flag = true;
        for(int i = 0;i < n/2;i++){
            if(arr[i]!=arr[j]){
                flag = false;
                break;
            }j--;
        }
        if(flag==true)System.out.print("Palindrome");
        else System.out.print("Not a palindrome");
    }
}
