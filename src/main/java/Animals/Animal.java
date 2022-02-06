package Animals;

public abstract class Animal {
    String name;
    String color;
    String weight;

    public Animal(String name, String color, String weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public abstract String makesSound();

    public abstract void sleeps();

    public abstract void eats();
}
