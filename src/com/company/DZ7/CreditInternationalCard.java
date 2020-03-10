package company.DZ7;

/**
 * международная Кредитная карта Visa Беларусбанка
 */
public class CreditInternationalCard extends InternationalVisaCard {
private double percent;

    public CreditInternationalCard(String bank, int howMathCash, String countries, String currency, double percent) {
        super(bank, howMathCash, countries, currency);
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public void creditcash() {
        System.out.println("Зачисленные деньги взяты в кредит,- необходимо отдать банку");
    }
}

