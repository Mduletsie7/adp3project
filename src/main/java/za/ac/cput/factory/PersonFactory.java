package za.ac.cput.factory;

import za.ac.cput.domain.Person;
import za.ac.cput.util.Helper;

public class PersonFactory {
    public static Person createPerson(String firstName, String lastName, String age, String gender) {
        if (Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName) || Helper.isNullOrEmpty(age)|| Helper.isNullOrEmpty(gender) ) {
            return null;
        }

        Person p1 = new Person.Builder(firstName, lastName, age, gender).build();

        return p1;
    }
}
