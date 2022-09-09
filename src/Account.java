import java.util.Scanner;

public class Account {
    double balance = 0;
    double amount = 0;
    Scanner sc = new Scanner(System.in);

    public void showBalance() {
        System.out.println("Your Balance is = " + balance+" Rs");
    }

    public void depositBalance() {
        System.out.println("- You Selected Deposit Program - ");
        System.out.println("Enter Amount in Digits  = ");
        double depositAmt = sc.nextDouble();
        balance = balance + depositAmt;

    }

    public void withdrawBalance() {
        System.out.println("- You Selected Withdraw Program - ");
        System.out.println("Your Balance is = ");
        double withdrawAmt = sc.nextDouble();
        balance=balance-withdrawAmt;
    }

    public static void main(String[] args) {

        System.out.println("Welcome ATM Machine Java Program");

        Account ac1 = new Account();
        Scanner choice = new Scanner(System.in);

        int option;
        do {
            System.out.println("***** ATM *****");
            System.out.println("1. Deosit Money");
            System.out.println("2. Withdrwal");
            System.out.println("3. Balance Check");
            System.out.println("4. Exit");
            System.out.println("Please Select the Operation Number : ");
            option = choice.nextInt();

            switch (option) {
                case 1:
                    ac1.depositBalance();
                    break;
                case 2:
                    ac1.withdrawBalance();
                    break;
                case 3:
                    ac1.showBalance();
                    break;

                case 4:
                    break;

            }
        } while (option != 4);

    }


}
