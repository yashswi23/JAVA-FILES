package PracticeQues;
class VotingInelligibleException extends RuntimeException{
    VotingInelligibleException(String msg){
        super(msg);
    }
   
}

class CheckVoteAge{
     public void validate(int age){
        if(age< 18){
            throw new VotingInelligibleException("Voting is not allowed age must be 18");
        }
        else{
            System.out.println("Eligible");
        }
    }
}

public class VotingException {
    public static void main(String[] args) {
        CheckVoteAge Vage = new CheckVoteAge();
        int age = 22;

        try{
            Vage.validate(age);
        }
        catch(VotingInelligibleException e){
            System.out.println(e.getMessage());
        }
    }
    
}
