public class Adress {
    protected String country;
    protected String city;

    public Adress(String country, String city) {
        this.country = country;
        this.city = city;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;
        Adress address = (Adress) obj;
        return country.equals(address.country) && city.equals(address.city);
    }

    @Override
    public int hashCode() {
        return country.hashCode() * 31 + city.hashCode();
    }
}
