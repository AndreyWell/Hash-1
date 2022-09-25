import java.util.HashMap;
import java.util.Map;

public class Main {

    public static final String LOREM_IPSUM = "Lorem ipsum dolor sit amet, consectetur " +
            "adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna " +
            "aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris " +
            "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit" +
            " in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint" +
            " occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit " +
            "anim id est laborum.";
    public static final int ONE = 1;

    public static void main(String[] args) {

        Map<Character, Integer> chars = new HashMap<>();

        for (int i = 0; i < LOREM_IPSUM.length(); i++) {
            char key = Character.toLowerCase(LOREM_IPSUM.charAt(i));
            if (Character.isLetter(key)) {
                if (!chars.containsKey(key)) {
                    chars.put(key, ONE);
                } else {
                    int value = chars.get(key) + ONE;
                    chars.put(key, value);
                }
            }
        }

        char maxChar = 'a';
        char minChar = maxChar;
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<Character, Integer> kv : chars.entrySet()) {
            int currentValue = kv.getValue();
            char currentChar = kv.getKey();
            if (currentValue > maxValue) {
                maxChar = currentChar;
                maxValue = currentValue;
            }

            if (currentValue < minValue) {
                minChar = currentChar;
                minValue = currentValue;
            }
        }

        System.out.println("Буква - " + maxChar + " встречалась чаще всего, количество повторов: "
                + maxValue);
        System.out.println("Буква - " + minChar + " встречалась реже всего, количество повторов: "
                + minValue);
    }
}
