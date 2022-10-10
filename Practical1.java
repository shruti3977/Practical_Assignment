//This Program is prepared by 21CE118 Shruti Sangani
/*Aim :: Design a class named Account that contains:
 A private int data field named id for the account (default 0).
 A private double data field named balance for the account (default 0)
 A private double data field named annualInterestRate that stores the current
interest rate (default 0). Assume that all accounts have the same interest rate.
 A private Date data field named dateCreated that stores the date when the
account was created.
 A no-arg constructor that creates a default account.
 A constructor that creates an account with the specified id and initial balance.
 The accessor and mutator methods for id, balance and annualInterestRate.
 The accessor method for dateCreated.
 A method named getMonthlyInterestRate() that returns the monthly interest
rate.
 A method named getMonthlyInterest() that returns the monthly interest.
 A method named withdraw that withdraws a specified amount from the
account.
 A method named deposit that deposits a specified amount to the account.
 */
import java.util.Scanner;
import java.util.Date;
import java.util.UUID;

public class Practical1 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Account a = new Account();
        System.out.println();
        System.out.println("The Practical1.Account Creation Date is : ");
        System.out.println(a.date.toString());
        System.out.println();
        a.data();
        int i;
        for (i = 1; i >= 1; i++) {
            System.out.println("Enter Your Input : ");
            int k = t.nextInt();
            switch (k) {
                case 1:
                    a.deposit();
                    a.data();
                    continue;
                case 2:
                    a.withdraw();
                    a.data();
                    continue;
                case 3:
                    a.getMonthlyInterestRate();
                    a.data();
                    continue;
                default:
                    System.out.println(" Error Accurs ");

            }
        }
    }
}