import java.util.Scanner;
import university.University;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Function call to create University
        System.out.println("Enter the University Name:");
        String universityName = scanner.nextLine();
        System.out.println("Enter the Vice Chancellor Name:");
        String viceChancellor = scanner.nextLine();
        System.out.println("Enter the number of departments:");
        int numDepartments = scanner.nextInt();
        scanner.nextLine(); 

        University university = new University(universityName, viceChancellor, numDepartments);

        // Function call to create Departments
        for (int i = 1; i <= numDepartments; i++) {
            System.out.println("Enter the Department" + i + " Name:");
            String departmentName = scanner.nextLine();
            System.out.println("Enter the HOD Name for Department" + i + ":");
            String hodName = scanner.nextLine();
            System.out.println("Enter the number of courses in Department" + i + ":");
            int numCourses = scanner.nextInt();
            scanner.nextLine(); 
            university.add_dep(departmentName, hodName, numCourses);
        }

        // Function call to display University Information
        university.display_uni();

        scanner.close();
    }
}
