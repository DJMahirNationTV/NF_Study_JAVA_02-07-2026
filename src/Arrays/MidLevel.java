package Arrays;

public class MidLevel {
    public static void level1(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i <= array.length; i += 2) {
            System.out.println(i);
        }
    }
    public static void level2(String[] args) {
        int[] array = {6,1,8,7,2,5,8,3,9,4};

        for (int arr : array) {
            System.out.println(arr+arr);
        }
    }
}
