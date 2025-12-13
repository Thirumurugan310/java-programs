import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000; 
        int choice;
        System.out.println(" MINI ATM ");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit Money");
        System.out.println("3.Withdraw Money");
        System.out.println("4.Exit");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Your Balance:" + balance);
                break;
            case 2:
                System.out.print("Enter deposit amount:");
                double deposit = sc.nextDouble();
                balance = balance + deposit;
                System.out.println("Updated Balance:" + balance);
                break;
            case 3:
                System.out.print("Enter withdrawal amount:");
                double withdraw = sc.nextDouble();
                if (withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Please collect your cash");
                    System.out.println("Remaining Balance:" + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;
            case 4:
                System.out.println("Aprm ethukku bro vanthinga");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
