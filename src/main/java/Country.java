public enum Country {


    RUSSIA("Россия", true),
    ISTANBUL("Стамбул", false);

    public String ruName;
    public boolean isOpen;

    Country(String ruName, boolean isOpen){
        this.ruName = ruName;
        this.isOpen = isOpen;
    }


    @Override
    public String toString() {
        return "<"+this.name() + "> " + "<" + ruName + ">";
    }

    public static Country getByRuName(String ruName) throws NoCountryException {
        Country selectedCountry = null;
        for (Country country: Country.values()) {
            if(country.ruName.equals(ruName)){
                selectedCountry = country;
            }
        }
        if(selectedCountry == null){
            throw new NoCountryException("Страна не найдена");
        } else {
            return selectedCountry;
        }
    }
}


