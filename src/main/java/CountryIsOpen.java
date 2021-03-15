import java.util.Scanner;

public class CountryIsOpen {
    public static void main(String[] args) {
        CountrySelector countrySelector = new CountrySelector();
        System.out.println("Доступные страны:");
        for (Country x: Country.values()) {
            System.out.println(x);
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nВведите название страны, 0 - для выхода:");
            String userInput = scanner.next();
            if (userInput.equals("0")){
                break;
            }
            try {
                countrySelector.printCountryIsOpen(userInput);
            } catch (NoCountryException e) {
                System.out.println("Страна " + userInput + " не обнаружена.");;
            }
        }
    }
}

