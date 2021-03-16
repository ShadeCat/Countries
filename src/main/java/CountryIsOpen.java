import java.util.Scanner;

public class CountryIsOpen {
    public static void main(final String[] args) {
        System.out.println("Доступные страны:");
        for (Country x : Country.values()) {
            System.out.println(x);
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nВведите название страны, 0 - для выхода:");
            String userInput = scanner.next();
            if (userInput.equals("0")) {
                break;
            }
            try {
                CountrySelector.findByName(userInput);
            } catch (NoCountryException NullPointerException) {
                System.out.println("Страна " + userInput + " не обнаружена.");
            }
        }
    }
}


