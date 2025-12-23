import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int m = sc.nextInt();
        int[] ar = new int[m];
         for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        int[] a = new int[n+m];
        int k = 0;
        for(int i = 0;i < n; i++){
            a[k++] = arr[i];
        }
        
        for(int i = 0;i < m; i++){
            a[k++] = arr[i];
        }
        
        Arrays.sort(a);
        
        for(int i = 0;i < n+m;i++){
            System.out.print(a[i]+" ");
        }
    }
}
