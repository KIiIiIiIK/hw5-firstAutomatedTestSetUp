package Animals;

public class Cat extends Animal {

    public Cat(String name, String color, String weight) {
        super(name = "Mickey", color = "ginger", weight = "5kg");
    }

    @Override
    public String makesSound() {
        return "meow";
    }

    @Override
    public void sleeps() {System.out.println("sleeps: All day");
    }

    @Override
    public void eats() {System.out.println("eats: Fish");
    }

}