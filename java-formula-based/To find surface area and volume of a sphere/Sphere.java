import java.util.Scanner;
public class Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double surfaceArea = 4*Math.PI*r*r;
        double volume = (4.0/3.0)*Math.PI*r*r*r;
        System.out.printf("%.2f\n",surfaceArea);
        System.out.printf("%.2f",volume);
    }
}
