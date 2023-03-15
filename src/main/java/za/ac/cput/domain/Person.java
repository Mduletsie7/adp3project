package za.ac.cput.domain;

import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private String age;

    private String gender;
    private boolean isEmployed;

    public Person() {
    }

    private Person(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.isEmployed = builder.isEmployed;;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", isEmployed=" + isEmployed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return getLastName().equals(person.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLastName());
    }

    public static class Builder{

        private String firstName;
        private String lastName;
        private String age;

        private String gender;
        private boolean isEmployed;

        public Builder(String firstName, String lastName, String age, String gender){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.gender = gender;
        }

        public Builder setEmployed(boolean employmentStatus) {
            isEmployed = employmentStatus;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }


}
