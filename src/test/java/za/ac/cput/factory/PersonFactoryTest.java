package za.ac.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Person;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersonFactoryTest {

    @Test
    public void equalityTest() {
        Person p1 = new Person();
        p1 = PersonFactory.createPerson("Tom", "Ford", "100", "Male");
        assertEquals(p1.getFirstName(), "Virgil");
    }

    @Test
    public void objectIdentityTest() {
        Person p1 = new Person();
        p1 = PersonFactory.createPerson("Tom", "Ford", "100", "Male");
        Person p2 = new Person();
        p2 = PersonFactory.createPerson("Virgil", "Dyk", "60", "Male");

        assertSame(p1, p2);
    }
    @Test
    public void failTest() {
        Person p1 = new Person();
        p1 = PersonFactory.createPerson("Tom", "Ford", "100", "Male");
        assertNotNull(p1);
        fail();
    }
    @Test
    void timeOutTest() {
        assertTimeout(Duration.ofMillis(50), () -> {
            Thread.sleep(1350);

        });
    }

    @Test
    @Disabled
    public void disablingTest() {
        Person p1 = new Person();
        p1 = PersonFactory.createPerson("Tom", "Ford", "100", "Male");
        assertNotNull(p1);
    }


}