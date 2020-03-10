package company.DZ7;
//Создать иерархию классов ,описывающих банковские карты.Иерархия должна иметь хотябы три уровня
/**
 * карта  Беларусбанка
 */
public class BelarusBankCard implements BankCard {
    private String Bank;
    private int howMathCash;

    public BelarusBankCard(String bank, int howMathCash) {
        Bank = bank;
        this.howMathCash = howMathCash;
    }

    public String getBank() {
        return Bank;
    }

    public void setBank(String bank) {
        Bank = bank;
    }

    public int getHowMathCash() {
        return howMathCash;
    }

    public void setHowMathCash(int howMathCash) {
        this.howMathCash = howMathCash;
    }

    @Override
    public void info() {
        System.out.println("я карта " + this.getClass());
    }

    public static void main(String[] args) {
        InstallmentCard installmentCard = new InstallmentCard("BelarusBank", 5000, "All",
                "USD", 12.5, 12);

        installmentCard.info();
        installmentCard.cash();
        installmentCard.creditcash();
        installmentCard.installmentcash();
    }
}


