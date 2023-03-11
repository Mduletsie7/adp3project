package za.ac.cput.domain;

public class Animal {
    private String colour;
    private String species;
    private String sound;
    private int age;
    private int noOfLegs;

    public Animal() {}

    public String getColour() {
        return colour;
    }

    public String getSpecies() {
        return species;
    }

    public String getSound() {
        return sound;
    }

    public int getAge() {
        return age;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "colour='" + colour + '\'' +
                ", species='" + species + '\'' +
                ", sound='" + sound + '\'' +
                ", age=" + age +
                ", noOfLegs=" + noOfLegs +
                '}';
    }
}
