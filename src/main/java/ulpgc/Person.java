package ulpgc;

public class Person {
    private int index;
    private double height;
    private double weight;

    public Person(int index, double height, double weight) {
        this.index = index;
        this.height = height;
        this.weight = weight;
    }

    public int getIndex() {
        return index;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
