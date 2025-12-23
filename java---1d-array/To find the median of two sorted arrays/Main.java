import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        } 
        int m = sc.nextInt();
        int[] ar = new int[m];

        for(int i = 0; i < m; i++){
            ar[i] = sc.nextInt();
        }
        int j = 0;
        int[] a = new int[n+m];
        for(int i = 0;i < n;i++){
            a[j++] = arr[i];
        }
        for(int i = 0;i < m;i++){
            a[j++] = ar[i];
        }
        Arrays.sort(a);
        int aa = 0;
        for(int i = 0;i < (n+m)/2;i++){
             aa = i;
        }
        if((n+m)%2==0)System.out.print((double)(a[aa]+a[aa+1])/2);
        else System.out.println(a[aa+1]);
    }
}
