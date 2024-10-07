public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();

        Pig pig = new Pig("Peppa");
        Duck duck = new Duck("Donald");
        Fish fish = new Fish("Koi");

        farm.addAnimal(pig);
        farm.addAnimal(duck);
        farm.addAnimal(fish);

        farm.printSwimmingAnimals();

        farm.printWalkingAnimals();
    }
}