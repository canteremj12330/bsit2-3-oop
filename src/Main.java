public class Main {
    public static void main(String[] args) {
        GradeCalculator gcalculator = new GradeCalculator();


        String studentName = "John Smith";
        double average = gcalculator.calculateAverage(85.5, 92.0, 78.5, 90.0);
        String letterGrade = gcalculator.getLetterGrade(average);


        gcalculator.displayResult(studentName, average);

        gcalculator.displayResult(studentName, average, letterGrade);
    }
}
