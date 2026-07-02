package Arrays;

public class EasyLevel {
    public static void level1(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
    }
    public static void level2(String[] args) {
        String[] textArray = {"Test", "John Cena", "The Rock"};

        for (int i = 0; i < textArray.length; i++) {
            String result = textArray[i] = textArray[i];
            System.out.println(result);
        }
    }
    public static void level3(String[] args) {
        for (int i = 0; i <= 10; i++) {
            int result = i;
            System.out.println(result);
        }
    }
}