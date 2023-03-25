public class Horse extends Animal {
    @Override
    public void methodAbstract() {

    }

    private String color;

    public Horse(String name, int age, int weight, String gender, String color) {
        super(name, age, weight, gender);
        this.color = color;
    }

    public Horse() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "color='" + color + '\'' +
                '}';
    }
}
