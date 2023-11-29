import java.util.Random;

public class ServerNameGenerator {
    // Create two arrays whose elements are strings:
    // one with at least 10 adjectives
    // another with at least 10 nouns
    private static String[] adjectives = {"happy", "panoramic", "pale", "flippant", "endurable", "harsh", "joyous", "ubiquitous", "groovy", "dazzling"};

    private static String[] nouns = {"phone", "goal", "speaker", "mode", "communication", "imagination", "inspector", "cards", "year", "guitar", "calendar"};

    // Create a method that will return a random element from an array of strings
    public static String getRandomElement(String[] array) {
        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }

    // Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
    public static void main(String[] args) {
        String adjective = getRandomElement(adjectives);
        String noun = getRandomElement(nouns);

        String serverName = adjective + "-" + noun;

        System.out.println("Here is your server name: ");
        System.out.println(serverName);
    }
}



