package Animals;

class Dog {
    public String name;
    public String sound;
public String makeNoise(){
    return String.format(
            "Name: %s%n" +
            "Sound: %s%n",
    name, sound
            );
    }
}


