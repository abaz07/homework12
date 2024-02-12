public class author {
    private String firstName;
    private String lastName;
    private int age;
    public author() {
    }

    public author(String firstName) {
        this.firstName = firstName;
    }

    public author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public java.lang.String getFirstName() {
        return firstName;
    }

    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    public java.lang.String getLastName() {
        return lastName;
    }

    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "author{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", age=" + age +
                '}';
    }
}
