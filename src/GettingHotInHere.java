import java.util.Scanner;

public class GettingHotInHere {
    /**
     * @author Trevor Hartman
     * @author Adrienne van Summern
     * @since version 1.0
     *
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");
        int number = scanner.nextInt();
        double celsius = (number - 32) * (5/ (double) 9);
        int simpleCelsius = (int) celsius;

        //I modified the number of decimals outputted, so it's close to how temperature is presented typically
        System.out.printf("%d°F\n%.2f°C\n%d°C\n", number, celsius, simpleCelsius);
        System.out.printf("If it were 2°C warmer it would be: %.2f°C" , (celsius + 2));
    }
}
