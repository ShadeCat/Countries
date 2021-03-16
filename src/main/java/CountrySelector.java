public class CountrySelector {

    public static void findByName(final String countryName) throws NoCountryException, NullPointerException {
        String upperName = countryName.toUpperCase();
        Country selectedCountry;
        try {
            selectedCountry = Country.valueOf(upperName);
        } catch (IllegalArgumentException e) {
            selectedCountry = null;
        }
        if (selectedCountry == null) {
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
