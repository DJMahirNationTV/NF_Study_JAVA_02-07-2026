package Arrays;

public class customLevel {
    public static void array(String[] args) {
        String[] array = {"Test", "John Cena", "The Rock"};

        for (int i = 0; i < array.length; i++) {
            String result = array[i] = array[i];
            System.out.println(result);
        }


    }
}
