package university;

import java.util.Scanner;

class Department {
    private String dep_name;
    private String hod_name;
    private Course[] courses;
    private int course_count;

    public Department(String dep_name, String hod_name, int max_courses) {
        this.dep_name = dep_name;
        this.hod_name = hod_name;
        this.courses = new Course[max_courses];
        this.course_count = 0;
        add_course();
    }

    // Method to add courses to the department
    private void add_course() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= courses.length; i++) {
            System.out.println("Enter the Course" + i + " Name for " + dep_name + ":");
            String course_name = scanner.nextLine();
            courses[course_count] = new Course(course_name);
            course_count++;
        }
    }

    // Method to display department information
    public void display_dep() {
        System.out.println("Department Name: " + dep_name);
        System.out.println("Head of Department: " + hod_name);
        for (int i = 0; i < course_count; i++) {
            courses[i].display_course();
            System.out.println();
        }
    }
}
