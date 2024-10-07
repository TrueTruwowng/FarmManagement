public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    public void swim() {
        System.out.println(getName() + " can swim.");
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a fish named " + getName());
    }
}