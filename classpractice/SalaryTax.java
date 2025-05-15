import java.util.Scanner;

 public class SalaryTax{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Monthly Income ");
       double Monthlyincome = s.nextDouble();

       double annualincome = Monthlyincome*12;
       double tax = 0;
       if(annualincome <= 50000){
        tax= 0;
       }

       else if(annualincome<= 100000 ){
tax = (annualincome-50000) *0.10;
       }
       else {
        tax = (50000*0.10) + (annualincome-100000)*0.20;
       }


       double netsalary = annualincome-tax;

       System.out.println("Annual Income: "+ annualincome);
       System.out.println("Tax: "+ tax);
       System.out.println("Net Salary: "+ netsalary);
        
    }
 } 