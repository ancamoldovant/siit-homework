package ObjectContainers;

public class Adresa {
    private String countries;
    public String getCountries() {
        return countries;
    }

    public Adresa(String countries) {
        this.countries=countries;
    }

    @Override
    public String toString() {
        return countries;
    }
}
