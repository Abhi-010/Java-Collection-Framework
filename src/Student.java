

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String emailAddress ;
    private String location ;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", emailAddress='" + emailAddress + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public Student() {
    }

    public Student(String name, int age, String emailAddress, String location) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public int compareTo(Student o) {
        if(this.age > o.age){
            return -1;
        }
        else if(this.age < o.age){
            return 1;
        }
        return 0;
    }
}
