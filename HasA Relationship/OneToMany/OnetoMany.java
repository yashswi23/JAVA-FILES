class Student{
    String id;
    String name;
    Courses[] course;
    Student(String id, String name,Courses[] course1){
        this.id = id;
        this.name = name;
        this.course = course1;
    }

    void getDetails(){
        System.out.println("Id of the Student is: "+ id);
        System.out.println("Name of the Student is: "+ name);
        System.out.println("Details of the Course is ");
        for(int i=0;i<course.length ;i++){
            System.out.println("Course: "+(i+1)+" "+course[i].coursename);
        }
        System.out.println("----------------------------!");


    }

}
class Courses{

    String courseId;
    String coursename;
    Courses(String id, String name){
        this.courseId =id;
        this.coursename = name;
    }

}
public class OnetoMany {
    public static void main(String[] args) {

        Courses c1 = new Courses("101", "Java");
        Courses c2 =  new Courses("102", "C++");
        Courses c3 = new Courses("103", "MySQL");
        Courses[] course1 = {c1,c2,c3};

        Student s1 = new Student("1", "Yashswi", course1);
        s1.getDetails();

        Courses c4 = new Courses("101", "Java");
        Courses c5 =  new Courses("102", "C++");
        Courses c6 = new Courses("103", "MySQL");
        Courses[] course2 = {c1,c2,c3};

        Student s2 = new Student("2", "Aman", course1);
        s2.getDetails();

        
    }
}
