public class Pig extends Animal {
    public Pig(String name) {
        super(name);
    }

    // Phương thức đi bộ
    public void walk() {
        System.out.println(getName() + " can walk");
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a pig named " + getName());
    }
}