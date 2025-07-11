package Challenge_4.ArrayChallenges;

public class ArrayChallenge {
    public static void main(String[] args) {
        String[] objects = {"B123", "C234", "A345", "C15", "B177", "G3003","C235","B179"};
        for(String item: objects) {
            if(item.startsWith("A")){
                System.out.println(item);
            }
        }
    }
}
