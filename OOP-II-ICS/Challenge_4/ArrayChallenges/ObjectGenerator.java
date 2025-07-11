package Challenge_4.ArrayChallenges;

import java.util.Arrays;
import java.util.Random;

public class ObjectGenerator {
    public static void main(String[] args){
        Random random = new Random();
        String[] object = new String[5];

        for (int i = 0; i < object.length; i++) {
            char prefix = (char) (random.nextInt(5) + 'A');
            int number = random.nextInt(999) + 1;
            String suffix = String.format("%03d", number);
            object[i] = prefix + suffix;
        }
        for (String objects: object){
            System.out.println(objects);
        }
    }
}
