package package1;

import java.util.Objects;

public class Human {
    private String FirstName;  //Имя
    private String LastName;   //Фамилия
    private String MiddleName; //Отчество
    private int age;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human(String firstName, String lastName, String middleName, int age) {
        if(age < 0 || firstName == null || lastName == null
                || middleName == null || firstName.equals("") || lastName.equals("")){
            throw new IllegalArgumentException("unfaithful data");
        }
        FirstName = firstName;
        LastName = lastName;
        MiddleName = middleName;
        this.age = age;
    }
    public void print(){
        System.out.println(FirstName + " " + LastName + " " + MiddleName + ". ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(FirstName, human.FirstName) && Objects.equals(LastName, human.LastName) && Objects.equals(MiddleName, human.MiddleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FirstName, LastName, MiddleName, age);
    }
}
