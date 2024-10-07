import java.util.ArrayList;

public class Farm {
    private ArrayList<Animal> animals;

    public Farm() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void printSwimmingAnimals() {
        System.out.println("Animals that can swim:");
        for (Animal animal : animals) {
            if (animal instanceof Duck) {
                ((Duck) animal).swim();
            } else if (animal instanceof Fish) {
                ((Fish) animal).swim();
            }
        }
    }


    public void printWalkingAnimals() {
        System.out.println("Animals that can walk:");
        for (Animal animal : animals) {
            if (animal instanceof Pig) {
                ((Pig) animal).walk();
            } else if (animal instanceof Duck) {
                ((Duck) animal).walk();
            }
        }
    }
}