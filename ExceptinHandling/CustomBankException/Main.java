import java.util.Scanner;

class InsuffieceintBalanaceException extends Exception{
    InsuffieceintBalanaceException(){
        super("Sorry! Insuffiecient Bank Account Papa se kho paise daalne ko");
    }

    InsuffieceintBalanaceException(String error){
        super(error);
    }

}

class Withdraw {
    int balance = 10000;
    void WithdrawMoney(int amount) throws InsuffieceintBalanaceException{
        if(amount> balance){
            throw new InsuffieceintBalanaceException("Insuffiecent Amount Withdraw Request By User");
        }
        else{
            System.out.println("Take Your Cash with Balance Amount: "+ (balance-amount));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Withdraw with = new Withdraw();
        try{
            Scanner sc = new Scanner(System.in);
            int amount = sc.nextInt();

            with.WithdrawMoney(amount);
        }
        catch(InsuffieceintBalanaceException e){
            System.out.println(e);
        }
    }
    
}
