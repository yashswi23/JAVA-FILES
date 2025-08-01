class InelligibleException extends RuntimeException{
    public InelligibleException(String msg){
        super(msg);
    }
}

class Result{
    public void validate(int marks){
            if(marks< 35){
                throw new InelligibleException("Student is ineligible! Marks are less than 35.");
            }
            else{
                System.out.println("Student is eligible");
            }
        }
}


public class CheckMarks {
    public static void main(String[] args){
        Result res= new Result();
        int marks = 23;
        try{
            res.validate(marks);
        }
        catch(InelligibleException e){
            System.out.println("Exception caught: "+e.getMessage());
        }

    }
}
