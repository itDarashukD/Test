package company.DZ7;

/**
 * карта  Беларусбанка
 */
public class BelarusBankCard implements BankCard {
    @Override
    public void info() {
        System.out.println("я карта " + this.getClass());
    }

    public static void main(String[] args) {
        InstallmentCard installmentCard = new InstallmentCard();

        installmentCard.info();
        installmentCard.cash();
        installmentCard.creditcash();
        installmentCard.installmentcash();

    }

}


