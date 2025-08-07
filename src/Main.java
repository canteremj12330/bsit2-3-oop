//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Prelim Exam");
        Student student1 = new Student("Jasper" , 20, "BSIT", 80, 90, 91);
        Student student2 = new Student("Liam" , 19, "BSIT", 70, 69, 71);
        Student student3 = new Student("James" , 21, "BSIT", 65, 60, 61);
        System.out.println();
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }
}