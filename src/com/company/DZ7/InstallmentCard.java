package company.DZ7;

/**
 * международная Кредитная карта Рассрочки Visa Беларусбанка
 */
public class InstallmentCard extends CreditInternationalCard {
    private int termInstallment;

    public InstallmentCard(String bank, int howMathCash, String countries, String currency, double percent,
                           int termInstallment) {
        super(bank, howMathCash, countries, currency, percent);
        this.termInstallment = termInstallment;
    }

    public int getTermInstallment() {
        return termInstallment;
    }

    public void setTermInstallment(int termInstallment) {
        this.termInstallment = termInstallment;
    }

    public void installmentcash() {
        System.out.println("Благодаря мне вы можете взять рассрочку на покупку товара");
    }
}

   