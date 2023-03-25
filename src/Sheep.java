public class Sheep extends Animal {

    public Sheep(String name, int age, int weight, String gender) {
        super(name, age, weight, gender);
    }

    public Sheep() {
    }

    @Override
    public void methodAbstract() {

    }

    @Override
    public String toString() {
        return "Sheep{} " + super.toString();
    }
}
