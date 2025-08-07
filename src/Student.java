public class Student {
    String name;
    int age;
    String course;
    double grade1;
    double grade2;
    double grade3;

    public Student(String studentname, int studentage, String studentcourse, double studentgrade1, double studentgrade2, double studentgrade3) {
    name = studentname;
    age = studentage;
    course = studentcourse;
    grade1 = studentgrade1;
    grade2 = studentgrade2;
    grade3 = studentgrade3;


    }
    public void displayInfo(){
        System.out.println("Students");
        System.out.println("Name" + name + ", " + "Age"+ age + ", "+ "Course:" + course);
        System.out.println("Grades:"+ grade1+", " + grade2+", "+grade3);
        double sum = grade1 + grade2 + grade3;
        double average = sum / 3.0;
        System.out.println("Average:" +average);
        String remarks = average < 70 ? "FAILED" : "PASSED";
        System.out.println("Status:" + remarks);


    }
}