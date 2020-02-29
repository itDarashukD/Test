package company.dz5;


public class MoneyValidator {
    /**
     * запрос в хранилище - есть -ли такая сумма
     * Рассчет какими купюрами выдавать
     */

    public static int calculateMoney() {

        boolean howSum;
        if (MoneyStorage.getSumMoney() > MoneyOutput.howMatchMoneyTakeAway) {//Сравнивает сумму денег в хранилище с требуемой
            // для снятия суммой, если в хранилище денег больше, то тру и рассчитываем какими купюрами выдавать
            howSum = true;
        } else {
            System.out.println("В банкомате нет такого количества денег");
        }

        // рассчитываем какими купюрами выдавать
        if (howSum = true) {
            int piatidesiatka = 0;
            int sotnya = 0;
            int sotnya1 = 0;
            int dvadcatka = 0;

            if (MoneyOutput.howMatchMoneyTakeAway < 10000) {
                sotnya = MoneyOutput.howMatchMoneyTakeAway / 100 * 100;
                sotnya1 = MoneyOutput.howMatchMoneyTakeAway / 100;
                return sotnya1;
                if (MoneyStorage.getNote100() > sotnya1) {//проверка хватит-ли сотен в хранилице,для выдачи,если да,то:
                    if (MoneyOutput.howMatchMoneyTakeAway - sotnya == 50) {
                        piatidesiatka = 1;
                        return piatidesiatka;
                    }
                    if ((MoneyOutput.howMatchMoneyTakeAway - sotnya) % 20 == 0) {

                        dvadcatka = (MoneyOutput.howMatchMoneyTakeAway - sotnya) / 20;
                        return dvadcatka;
                    }

                    System.out.println("Количество купюр для выдачи номиналом 100 " + sotnya1);
                    System.out.println("Количество купюр для выдачи номиналом 50 " + piatidesiatka);
                    System.out.println("Количество купюр для выдачи номиналом 20 " + dvadcatka);
                } else {
                    sotnya1 = MoneyStorage.getNote100();//если сотен в хранилище меньше требуемого количества,то :
                    int difference = MoneyOutput.howMatchMoneyTakeAway - sotnya;
                    return sotnya1;
                    piatidesiatka = difference / 50;
                    return piatidesiatka;
                    if ((MoneyOutput.howMatchMoneyTakeAway - sotnya) % 20 == 0) {

                        dvadcatka = (MoneyOutput.howMatchMoneyTakeAway - sotnya) / 20;
                        return dvadcatka;
                    }
                    System.out.println("Количество купюр для выдачи номиналом 100 " + sotnya1);
                    System.out.println("Количество купюр для выдачи номиналом 50 " + piatidesiatka);
                    System.out.println("Количество купюр для выдачи номиналом 20 " + dvadcatka);
                }
            }
            // передаем в хранилище количество купюр которое будем выдавать
            MoneyStorage.howMachNoteMoneyTakeAway();


        }

    }
}