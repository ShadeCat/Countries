public class CountrySelector {
    public static void printCountryIsOpen(final String countryName) throws NoCountryException {
        findByName(countryName);
    }


    private static void findByName(final String countryName) throws NoCountryException {
        String upperName = countryName.toUpperCase();
        try {
            System.out.println(getsOpenMessage(Country.valueOf(upperName)));
        } catch (IllegalArgumentException e1) {
            System.out.println("Страна" + countryName + " не найдена. Ищу по русскому названию");
            findByRussianName(countryName);
        }
    }

    private static void findByRussianName(final String countryName) throws NoCountryException {
        System.out.println(getsOpenMessage(Country.getByRuName(countryName)));
    }

    private static String getsOpenMessage(final Country country) {
        String isOpenMessage = "Страна " + country;
        if (country.getIsOpen()) {
            isOpenMessage += " открыта";
        } else {
            isOpenMessage += " закрыта";
        }
        return isOpenMessage;
    }
}
