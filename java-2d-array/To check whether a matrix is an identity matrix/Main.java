import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                a[i][j]=sc.nextInt();
        if(n!=m){
            System.out.print("Not Identity");
            return;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i==j && a[i][j]!=1) || (i!=j && a[i][j]!=0)){
                    System.out.print("Not Identity");
                    return;
                }
            }
        }
        System.out.print("Identity");
    }
}
