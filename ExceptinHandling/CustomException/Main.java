import java.util.Scanner;

class AgeException extends Exception{
    AgeException(){
        super("if no mesaage is passed then this error will show");
    }

    AgeException(String error){
        super(error);
    }
}

class ValidVote{
    int age;
    void checkVoter(int age) throws AgeException{
        this.age = age;
        if(age<18){
           throw  new AgeException("Sorry your age is less than 18 You cann't Vote ");
        }
        else{
            System.out.println("You can vote");
        }
      
    }
}

public class Main {
    public static void main(String[] args) {
        ValidVote obj = new ValidVote();
        try{
            Scanner sc= new Scanner(System.in);
            int age = sc.nextInt();
        obj.checkVoter(age);
        }catch(AgeException e){
            System.out.println(e);
        }
    }
    
}
