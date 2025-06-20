package OOPS;

public class BankAccount {
    String ownerName;
    double balance;

    double deposite(double money){
        if(money>0) {
            balance += money;
            System.out.println("the amount " + money + " is deposited");
        }else{
            System.out.println("Invalid amount.Amount cannot be negative");
        }
        return balance;
    }

    double withdraw(double money){
        if(money<=balance){
            balance-=money;
            System.out.println("the amount "+money+" is withdraw & current balance is "+balance);

        }else{
            System.out.print("Not enough balance");
        }
        return balance;
    }

}
