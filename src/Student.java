public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String department;
    private String major;
    private String email;

    public Student(String id, String firstName, String lastName, String department, String major, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.major = major;
        this.email = email;
    }

    public String getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getDepartment() {
        return department;
    }
    public String getMajor() {
        return major;
    }
    public String getEmail() {
        return email;
    }
}