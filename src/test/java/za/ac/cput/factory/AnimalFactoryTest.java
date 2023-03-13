/**
 * AnimalFactoryTest.java
 * This is the AnimalFactoryTest
 * @author Lerato Moshabi - 220076073
 * 11 March 2023
 */

package za.ac.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Animal;
import za.ac.cput.domain.Product;

import java.time.Duration;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

//AnimalFactoryTest class starts here
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

    // Object Equality Test
    @Test
    public void testCompareAnimalSpecies() {
        Animal animalSpecies = new Animal();
        Animal mySpecies = AnimalFactory.createAnimal("Black", "Cat", "Mhew");
        String speciesName = mySpecies.getSpecies().toString();
        assertEquals(speciesName, "Janguar");
    }


    // DISABLING TEST
    @Disabled("TODO: Still need to complete this method code")
    @Test
    public void test_animalColour() {
    }

    // TIMEOUT TEST
    @Test
    void testTimeOut() {
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(2000);

            System.out.println("Animals rule!");
        });
    }


    // Object Identity
    @Test
    public void testObjectIdentity() {
        Animal animal = new Animal();
        Animal animal1 = AnimalFactory.createAnimal("Blue", "Whale", "dfghtrg");
        Animal animal2 =  animal1;
        Animal animal3 = AnimalFactory.createAnimal("White", "Shark", "rete");

        if(animal1 == animal1) {
            System.out.println("Animals are identical");
        }
        if(animal1 == animal2) {
            System.out.println("Animals are identical");
        } else {
            System.out.println("Animals are not identical");
        }
        if(animal1 == animal3) {
            System.out.println("Animals are identical");
        } else {
            System.out.println("Animals are not identical");
        }
    }
}
