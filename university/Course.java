package university;

import java.util.Scanner;

class Course {
    private String course_name;
    private Faculty faculty;
    private Student student;

    public Course(String course_name) {
        this.course_name = course_name;
        this.faculty = new Faculty(course_name);
        this.student = new Student(course_name);
    }

    // Method to display course information
    public void display_course() {
        System.out.println("Course Name: " + course_name);
        faculty.display_faculty();
        student.display_student();
    }

    private static class Faculty {
        private String faculty_name;
        private String designation;

        public Faculty(String course_name) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Faculty Name for course " + course_name + ":");
            this.faculty_name = scanner.nextLine();
            System.out.println("Enter the Faculty Designation:");
            this.designation = scanner.nextLine();
        }

        // Method to display faculty information
        public void display_faculty() {
            System.out.println("Faculty Name: " + faculty_name);
            System.out.println("Faculty Designation: " + designation);
        }
    }

    private static class Student {
        private String student_name;
        private String rollNo;

        public Student(String course_name) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Student Name for course " + course_name + ":");
            this.student_name = scanner.nextLine();
            System.out.println("Enter the Student Roll No:");
            this.rollNo = scanner.nextLine();
        }

        // Method to display student information
        public void display_student() {
            System.out.println("Student Name: " + student_name);
            System.out.println("Student Roll No: " + rollNo);
        }
    }
}
