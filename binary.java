import java.util.Scanner;
public class binary {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the decimal number to be converted: ");
    int decimalNumber = scanner.nextInt();

    System.out.print("Enter the base value to convert to (between 2 and 16): ");
    int baseValue = scanner.nextInt();

    if (baseValue < 2 || baseValue > 16) {
        System.out.println("Invalid base value. Base value should be between 2 and 16.");
        return;
    }

    if (decimalNumber < 0) {
        System.out.println("Invalid decimal number. Decimal number should be non-negative.");
        return;
    }

    String convertedNumber = convertToBase(decimalNumber, baseValue);
    System.out.println("The equivalent base-" + baseValue + " value of decimal " + decimalNumber + " is: " + convertedNumber);
}

    public static String convertToBase(int decimalNumber, int baseValue) {
        StringBuilder result = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % baseValue;
            if (remainder < 10) {
                result.insert(0, remainder);
            } else {
                char digit = (char) ('A' + remainder - 10);
                result.insert(0, digit);
            }
            decimalNumber = decimalNumber / baseValue;
        }

        return result.toString();
    }
}