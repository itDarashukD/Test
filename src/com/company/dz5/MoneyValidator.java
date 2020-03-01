package company.dz5;

import static company.dz5.MoneyOutput.getHowMatchMoneyTakeAway;

/**
 * запрос в хранилище - есть -ли такая сумма
 * Рассчет какими купюрами выдавать
 */

public class MoneyValidator {
    private static int piatidesiatka;
    private static int sotnya;
    private static int sotnya1;
    private static int dvadcatka;
    private static int sumNoteOutput;

    public static int getSumNoteOutput() {
        return sumNoteOutput;
    }

    public static void setSumNoteOutput(int sumNoteOutput) {
        MoneyValidator.sumNoteOutput = sumNoteOutput;
    }

    public static int getSumMoneyOutput() {
        return sumMoneyOutput;
    }

    public static void setSumMoneyOutput(int sumMoneyOutput) {
        MoneyValidator.sumMoneyOutput = sumMoneyOutput;
    }

    private static int sumMoneyOutput;

    public static int getPiatidesiatka() {
        return piatidesiatka;
    }

    public static void setPiatidesiatka(int piatidesiatka) {
        MoneyValidator.piatidesiatka = piatidesiatka;
    }

    public static int getSotnya() {
        return sotnya;
    }

    public static void setSotnya(int sotnya) {
        MoneyValidator.sotnya = sotnya;
    }

    public static int getSotnya1() {
        return sotnya1;
    }

    public static void setSotnya1(int sotnya1) {
        MoneyValidator.sotnya1 = sotnya1;
    }

    public static int getDvadcatka() {
        return dvadcatka;
    }

    public static void setDvadcatka(int dvadcatka) {
        MoneyValidator.dvadcatka = dvadcatka;
    }

    public static void calculateMoney() {
/**
 проверяем есть-ли в банкомате столько денег
 */
            if (MoneyStorage.getSumMoney() > getHowMatchMoneyTakeAway()) {
/**
 рассчитываем какими купюрами выдавать
 */
            if (MoneyOutput.getHowMatchMoneyTakeAway() < 1000) {
                sotnya = MoneyOutput.getHowMatchMoneyTakeAway() / 100 * 100;
                sotnya1 = MoneyOutput.getHowMatchMoneyTakeAway() / 100;

                if (MoneyStorage.getNote100() > sotnya1) {//проверка хватит-ли сотен в хранилице,для выдачи,если да,то:
                    if (MoneyOutput.getHowMatchMoneyTakeAway() - getSotnya() == 50) {
                        piatidesiatka = 1;
                    }
                    if ((MoneyOutput.getHowMatchMoneyTakeAway() - getSotnya()) % 20 == 0) {

                        dvadcatka = (MoneyOutput.getHowMatchMoneyTakeAway() - getSotnya()) / 20;
                    }
                    sumMoneyOutput = getDvadcatka() * 20 + getPiatidesiatka() * 50 + getSotnya1() * 100;
                    sumNoteOutput = getSotnya1() + getPiatidesiatka() + getDvadcatka();
                    System.out.println("Количество купюр для выдачи номиналом 100: " + getSotnya1());
                    System.out.println("Количество купюр для выдачи номиналом 50: " + getPiatidesiatka());
                    System.out.println("Количество купюр для выдачи номиналом 20: " + getDvadcatka());
                } else {
                    /**
                      если сотен в хранилище меньше требуемого количества,то :
                     */
                    sotnya1 = MoneyStorage.getNote100();
                    int difference = MoneyOutput.getHowMatchMoneyTakeAway() - getSotnya1();

                    piatidesiatka = difference / 50;

                    if ((MoneyOutput.getHowMatchMoneyTakeAway() - getSotnya()) % 20 == 0) {

                        dvadcatka = (MoneyOutput.getHowMatchMoneyTakeAway() - getSotnya()) / 20;

                    }
                    sumMoneyOutput = getDvadcatka() * 20 + getPiatidesiatka() * 50 + getSotnya1() * 100;
                    sumNoteOutput = getSotnya1() + getPiatidesiatka() + getDvadcatka();
                    System.out.println("Количество купюр для выдачи номиналом 100: " + getSotnya1());
                    System.out.println("Количество купюр для выдачи номиналом 50: " + getPiatidesiatka());
                    System.out.println("Количество купюр для выдачи номиналом 20: " + getDvadcatka());
                }

            }
                /**
                 передаем в хранилище количество купюр которое будем выдавать
                 */
                  MoneyStorage.howMachNoteMoneyTakeAway();
        } else {
            System.out.println("В банкомате нет такого количества денег");

        }
    }
}