package company.DZ7;

/**
 * международная карта Visa Беларусбанка
 */
public class InternationalVisaCard extends BelarusBankCard {
private String Countries;
private String currency;

    public InternationalVisaCard(String bank, int howMathCash, String countries, String currency) {
        super(bank, howMathCash);
        Countries = countries;
        this.currency = currency;
    }

    public String getCountries() {
        return Countries;
    }

    public void setCountries(String countries) {
        Countries = countries;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void cash() {
        System.out.println("мной можно рассчитываться заграницей");
    }
}

