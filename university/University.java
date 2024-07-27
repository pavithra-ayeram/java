package university;

public class University {
    private String uni_name;
    private String vice_chancellor;
    private Department[] departments;
    private int dep_count;

    public University(String uni_name, String vice_chancellor, int max_dep) {
        this.uni_name = uni_name;
        this.vice_chancellor = vice_chancellor;
        this.departments = new Department[max_dep];
        this.dep_count = 0;
    }

    // Method to add a department to the university
    public void add_dep(String dep_name, String hod_name, int max_courses) {
        if (dep_count < departments.length) {
            departments[dep_count] = new Department(dep_name, hod_name, max_courses);
            dep_count++;
        } else {
            System.out.println("Cannot add more departments. Maximum limit reached.");
        }
    }

    // Method to display University information
    public void display_uni() {
        System.out.println();
        System.out.println("University Name: " + uni_name);
        System.out.println("Vice Chancellor: " + vice_chancellor);
        System.out.println();
        for (int i = 0; i < dep_count; i++) {
            departments[i].display_dep();
            System.out.println();
        }
    }
}
