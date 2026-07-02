import Arrays.EasyLevel;
import Arrays.MidLevel;
import java.util.Scanner;

// Import class from calculator
public class Main {
    public static void main(String[] args) {
        Scanner selector = new Scanner(System.in);

        System.out.println("Please select the Exercrise and the Level (e.g.: Array_L1.1");
        String selection = selector.nextLine();
        System.out.println(selection);

        switch (selection) {
            case "Array_L1.1":
                EasyLevel.level1(args);
                break;
            case "Array_L1.2":
                EasyLevel.level2(args);
                break;
            case "Array_L1.3":
                EasyLevel.level3(args);
                break;
            case "Array_L2.1":
                MidLevel.level1(args);
                break;
            case "Array_L2.2":
                MidLevel.level2(args);
                break;
        }

    }
}
