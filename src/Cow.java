public class Cow extends Animal {

    public Cow(String name, int age, int weight, String gender) {
        super(name, age, weight, gender);
    }

    public Cow() {
    }

    @Override
    public void methodAbstract() {

    }

    @Override
    public String toString() {
        return "Cow{} " + super.toString();
    }
}
