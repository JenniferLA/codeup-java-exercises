package Animals;

public class DogTest {
    public static void main(String[] args) {
        Dog hobbes = new Dog();

        hobbes.name = "Hobbes";
        hobbes.sound = "woof";

        System.out.println(hobbes.makeNoise());
        System.out.println(hobbes.name + " goes " + hobbes.sound + " " + hobbes.sound + "!");
    }
}
