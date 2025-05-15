import java.util.*;
enum Grade{
    A("Excellent"),
    B("Very Good, Keep it up"),
    C("Good"),
    D("Nice"),
    E("Needs Improvemnet"),
    F("Failed");

    private final String message;
    Grade(String msg){
        this.message = msg;
    }
    public String getMessage() {
        return message;
    }
    public static Grade getGrade(int marks) {
        if (marks >= 90) return A;
        if (marks >= 80) return B;
        if (marks >= 70) return C;
        if (marks >= 60) return D;
        return F;
    }
}

class Student{
    String name;
    int marks;
    Grade grade;

    Student(String n, int m){
        this.name = n;
        this.marks = m;
        this.grade = Grade.getGrade(marks);
    }

    public void displayInfo() {
        System.out.println("Student Name:"+  name + " | Marks: " + marks + " | Grade: " + grade + " | " + "Message: " + grade.getMessage());
    }


}

public class Enum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];
        for(int i=0;i<n;i++){
            String name;
            int marks;
            name = sc.nextLine();
            marks = sc.nextInt();
            sc.nextLine();

            students[i] = new Student(name, marks);
        }

        for(Student studenties : students){
            studenties.displayInfo();
        }
    }
}
