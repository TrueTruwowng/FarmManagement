public class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }

    public void swim() {
        System.out.println(getName() + " can swim.");
    }

    public void walk() {
        System.out.println(getName() + " can walk.");
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a duck named " + getName());
    }
}