public class CountrySelector {
    public void printCountryIsOpen(String countryName) throws NoCountryException {
        findByName(countryName);
    }


    private void findByName(String countryName) throws NoCountryException {
        String upperName = countryName.toUpperCase();
        try {
            System.out.println(getsOpenMessage(Country.valueOf(upperName)));
        } catch (IllegalArgumentException e1) {
            System.out.println("Страна" + countryName + " не найдена. Ищу по русскому названию");
            findByRussianName(countryName);
        }
    }

    private void findByRussianName(String countryName) throws NoCountryException {
        System.out.println(getsOpenMessage(Country.getByRuName(countryName)));
    }

    private String getsOpenMessage(Country country){
        String isOpenMessage = "Страна " + country;
        if (country.isOpen){
            isOpenMessage += " открыта";
        } else {
            isOpenMessage += " закрыта";
        }
        return isOpenMessage;
    }
}
