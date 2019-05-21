package QuestionInterview;

/**
 * Created by m.karandish on 1/29/2019.
 */
public class Account {

    private double balance;
    private double overdraftLimit;

    public Account(double overdraftLimit) {
        this.balance = 0;
        this.overdraftLimit = overdraftLimit > 0 ? overdraftLimit : 0;
    }

    public boolean deposit(double amount) {
        if(amount >= 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if(this.balance - amount >= -this.overdraftLimit && amount >= 0) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public static void main(String[] args) {
        Account account = new Account(10);
        account.withdraw(20);
       // account.deposit(30);
        System.out.println(account.getBalance());
        System.out.println(account.getOverdraftLimit());
    }

}

/*
T E S T

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    private double epsilon = 1e-6;


    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);
        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }
     @Test
    public void depositShouldNotBeNegative() {
       Account account = new Account(-20);
       Assert.assertEquals(false, account.deposit(-20));


    }
     @Test
    public void withdrawShouldNotBeNegative() {
        Account account = new Account(-20);
        Assert.assertEquals(false, account.withdraw(-20));


    }
    @Test
    public void depiteOverstep() {
       Account account = new Account(10);
       Assert.assertEquals(false, account.deposit(20));


    }
    @Test
    public void depositingCorrectly() {
       Account account = new Account(10);
       Assert.assertEquals(true, account.deposit(10));
       Assert.assertEquals(true, account.withdraw(10));

    }
     @Test
    public void depositingRespectively() {
       Account account = new Account(10);
         account.deposit(10);
        account.withdraw(20);
       Assert.assertEquals(0d,account.getOverdraftLimit());

    }
     @Test
    public void depositRespectively() {
        Account account = new Account(10);
        Assert.assertEquals(true, account.deposit(10));
    }
     @Test
    public void withdrawingRespectively() {
        Account account = new Account(10);
        Assert.assertEquals(true, account.withdraw(10));
    }

    @Test
    public void overStep() {
       Account account = new Account(10);
       account.deposit(10);
       System.out.println(account.getBalance());

       Assert.assertEquals(false,account.withdraw(20));

    }
}

 */
