//Private and Public Access Control.

class BankAccount{
    private String accNo;
    private double balance;

    public BankAccount(String accno, double bal){
        this.accNo = accno;
        this.balance = bal;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        if(amount<=balance){
        balance-=amount;
        }
    }

    public void checkBal(){
        System.out.println("Balance: "+balance);
    }
}

public class Account{
    public static void main(String[] args){
        BankAccount acc = new BankAccount("1234455",1000.0);
        acc.deposit(500);
        acc.withdraw(300);
        acc.checkBal();

    }
}

//constructors = objects ko initilialise karna 