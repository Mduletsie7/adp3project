/**
 * AnimalFactoryTest.java
 * This is the AnimalFactoryTest
 * @author Lerato Moshabi - 220076073
 * 11 March 2023
 */

package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Animal;

import static org.junit.jupiter.api.Assertions.*;

//AnimalFactoryTest class
class AnimalFactoryTest {
    @Test
    public void test(){
        Animal animal = AnimalFactory.createAnimal("Brown", "Dog", "Woof");
        System.out.println(animal.toString());
        assertNotNull(animal);
    }

    @Test
    public void test_fail(){
        Animal animal = AnimalFactory.createAnimal("", "Dog","Woof");
        System.out.println(animal.toString());
        assertNotNull(animal);
    }
}
