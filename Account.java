import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

class Account {
    int id = 0;
    static double balance = 500;
    double annualInterestRate = 0;
    Date date = new Date();
    Scanner sc = new Scanner(System.in);

    Account() {
        // to create a new id
        String uniqueID = UUID.randomUUID().toString();
        System.out.println("The Practical1.Account Number is : " + uniqueID);
        System.out.println("Your Practical1.Account balance is : " + balance);
    }

    void getMonthlyInterestRate() {
        double k = 4.9 / 12;
        System.out.println("The Monthly Interest Rate is : " + k);
    }

    void withdraw() {
        System.out.println("Enter the Amount that you want to Withdraw : ");
        double with = sc.nextDouble();
        if (with > balance) {
            System.out.println("Practical1.Account have insufficient balance!!!");
        } else {
            balance = balance - with;
            System.out.println("The updated balnce is : " + balance);
        }
    }

    void deposit() {
        System.out.println("Enter the Amount you want to Deposit : ");
        double depo = sc.nextDouble();
        balance = balance + depo;
        System.out.println("The updated balnce is : " + balance);

    }

    void data() {
        System.out.println();
        System.out.println("1.Deposit");
        System.out.println("2.Widthdraw");
        System.out.println("3.GetMonthlyInterestRate");
        System.out.println();
    }

    public Double getBalance() {
        return balance;
    }

    public int getId() {
        return 0;
    }

}
