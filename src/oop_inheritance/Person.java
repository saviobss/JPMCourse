package oop_inheritance;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName () {
        return firstName;
    }
    public String getLastName () {
        return lastName;
    }
    public int getAge () {
        return age;
    }
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    public void setAge (int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    public boolean isTeen () {
        if (this.getAge() > 12 && this.getAge() < 20) {
            return true;
        }
        return false;
    }
    public String getFullName () {
        if (this.getFirstName().isEmpty() && this.getLastName().isEmpty()) {
            return "";
        } else if (this.getLastName().isEmpty()) {
            return getFirstName();
        } else if(this.getFirstName().isEmpty()){
            return getLastName();
        }

        return getFirstName() + " " + getLastName();
    }

}
