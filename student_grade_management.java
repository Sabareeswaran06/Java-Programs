import java.util.Scanner;

class StudentGradeManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();  

        
        String[] studentNames = new String[numStudents];
        double[] studentGrades = new double[numStudents];
        
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student #" + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();
            
            System.out.print("Enter the grade of " + studentNames[i] + ": ");
            studentGrades[i] = scanner.nextDouble();
            scanner.nextLine();  
        }
        
        
        double totalGrades = 0;
        for (double grade : studentGrades) {
            totalGrades += grade;
        }
        double averageGrade = totalGrades / numStudents;

        
        System.out.println("\n--- Student Grade Report ---");
        for (int i = 0; i < numStudents; i++) {
            String result = (studentGrades[i] >= 50) ? "Pass" : "Fail"; 
            System.out.println(studentNames[i] + ": Grade = " + studentGrades[i] + " - " + result);
        }

        
        System.out.println("\nAverage Grade of All Students: " + averageGrade);
        
        
        String overallResult = (averageGrade >= 50) ? "Pass" : "Fail";
        System.out.println("Overall Result (Based on Average Grade): " + overallResult);

        scanner.close();
    }
}
