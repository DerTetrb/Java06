package package1;

public class Student extends Human{
    private String faculty;

    public Student(String firstName, String lastName, String middleName, String faculty, int age) {
        super(firstName, lastName, middleName, age);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

}
