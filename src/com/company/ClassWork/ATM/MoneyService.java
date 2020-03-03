package company.ClassWork.ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoneyService {

    private int howMatchMoneyTakeAway;
    private int piatidesiatka;
    private int sotnya;
    private int sotnya1;
    private int dvadcatka;
    private int sumNoteOutput;
    private int sumMoneyOutput;
    int d = 0;
    int p = 0;
    int s = 0;
    public int getPiatidesiatka() {
        return piatidesiatka;
    }

    public void setPiatidesiatka(int piatidesiatka) {
        this.piatidesiatka = piatidesiatka;
    }

    public int getSotnya() {
        return sotnya;
    }

    public void setSotnya(int sotnya) {
        this.sotnya = sotnya;
    }

    public int getSotnya1() {
        return sotnya1;
    }

    public void setSotnya1(int sotnya1) {
        this.sotnya1 = sotnya1;
    }

    public int getDvadcatka() {
        return dvadcatka;
    }

    public void setDvadcatka(int dvadcatka) {
        this.dvadcatka = dvadcatka;
    }

    public int getSumNoteOutput() {
        return sumNoteOutput;
    }

    public void setSumNoteOutput(int sumNoteOutput) {
        this.sumNoteOutput = sumNoteOutput;
    }

    public int getSumMoneyOutput() {
        return sumMoneyOutput;
    }

    public void setSumMoneyOutput(int sumMoneyOutput) {
        this.sumMoneyOutput = sumMoneyOutput;
    }

    public int getHowMatchMoneyTakeAway() {
        return howMatchMoneyTakeAway;
    }

    public void setHowMatchMoneyTakeAway(int howMatchMoneyTakeAway) {
        this.howMatchMoneyTakeAway = howMatchMoneyTakeAway;
    }
    /**
     * Метод принемающий купюры
     */
    public void inPutMoneyInAtm(MoneyStorage moneyStorage) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Засуньте купюры в купюроприемник, по окончании нажмите: 0 ");
            String sage = reader.readLine();
            int howMatchMoney = Integer.parseInt(sage);
            if (howMatchMoney == 0) {
                break;
            }/**
             проверка на номинал
             */
            if ((howMatchMoney != 20) && (howMatchMoney != 50) && (howMatchMoney != 100)) {
                System.out.println("Купюры такого номинала не принемаются, внесите купюры 20 ,50, 100");
            }
            if (howMatchMoney == 20) {
                moneyStorage.setNote20(++d);
            }
            if (howMatchMoney == 50) {
                moneyStorage.setNote50(++p);
            }
            if (howMatchMoney == 100) {
                moneyStorage.setNote100(++s);
            }
        }
        howMatchMoneyIncert(moneyStorage);

    }

    public void howMatchMoneyIncert(MoneyStorage moneyStorage) {  /**
     * рассчет общего количество внесенных купюр и денег
     */
        moneyStorage.setSumNote(moneyStorage.getNote20() + moneyStorage.getNote50() + moneyStorage.getNote100());
        System.out.println("Количество купюр номиналом 20 положено в банкомат: " + moneyStorage.getNote20());
        System.out.println("Количество купюр номиналом 50 положено в банкомат: " + moneyStorage.getNote50());
        System.out.println("Количество купюр номиналом 100 положено в банкомат: " + moneyStorage.getNote100());
        System.out.println("Общее количество купюр номиналом 20,50,100 положено в банкомат: " + moneyStorage.getSumNote());

        System.out.println("Сумма положенная в банкомат равна: " + (moneyStorage.getNote20() * 20 + moneyStorage.getNote50()
                * 50 + moneyStorage.getNote100() * 100));
        moneyStorage.setSumMoney(moneyStorage.getSumMoney() + moneyStorage.getNote20() * 20 + moneyStorage.getNote50()
                * 50 + moneyStorage.getNote100() * 100);
        System.out.println("Общая сумма в банкомате равна: " + moneyStorage.getSumMoney());
    }

    /**
     * Метод принемающий сумму для снятия, и проверяет ее на кратность 20,50
     */
    public void outPutMoneyFromAtm(MoneyStorage moneyStorage, MasterCart masterCart) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
/**
 проверка на кратность и размер снмаемой суммы
 */
        System.out.println("Введите сумму денег которую хотите снять, максимальная сумма 10000");

        while (true) {
            String sage = reader.readLine();
            howMatchMoneyTakeAway = Integer.parseInt(sage);

            if ((getHowMatchMoneyTakeAway() % 100 != 20) && (getHowMatchMoneyTakeAway() % 100 != 40) &&
                    (getHowMatchMoneyTakeAway() % 100 != 60) && (getHowMatchMoneyTakeAway() % 100 != 80) &&
                    (getHowMatchMoneyTakeAway() % 100 != 0) && (getHowMatchMoneyTakeAway() % 100 != 50) ||
                    (getHowMatchMoneyTakeAway() > 10000)) {
                System.out.println("Банкомат не может выдать такую сумму, введите сумму кратную 20 или 50, ограничение 10000");
                outPutMoneyFromAtm(moneyStorage,masterCart);
            }
            enoughMoneyInStorage(moneyStorage,masterCart);
        }
    }

    public void enoughMoneyInStorage(MoneyStorage moneyStorage,MasterCart masterCart) throws IOException {
        if (moneyStorage.getSumMoney() > getHowMatchMoneyTakeAway()) {
            if((moneyStorage.getSumMoney() < getHowMatchMoneyTakeAway())||(masterCart.getCashInCart() < getHowMatchMoneyTakeAway())){
                System.out.println("Операция не возможна: Не хватает денег на карте или в банкомате");
                outPutMoneyFromAtm(moneyStorage,masterCart);}
            /**
             рассчитываем какими купюрами выдавать
             */
            if (getHowMatchMoneyTakeAway() <= 10000) {
                sotnya = getHowMatchMoneyTakeAway() / 100 * 100;
                sotnya1 = getHowMatchMoneyTakeAway() / 100;
                if (moneyStorage.getNote100() > sotnya1) {//проверка хватит-ли сотен в хранилице,для выдачи,если да,то:
                    if (getHowMatchMoneyTakeAway() - getSotnya() == 50) {
                        piatidesiatka = 1;
                    }
                    if ((getHowMatchMoneyTakeAway() - getSotnya()) % 20 == 0) {
                        dvadcatka = (getHowMatchMoneyTakeAway() - getSotnya()) / 20;
                    }
                    moneyStorage.setSumNote(moneyStorage.getSumNote() - getSotnya1() + getPiatidesiatka() + getDvadcatka());
                    System.out.println("Количество купюр для выдачи номиналом 100: " + getSotnya1());
                    System.out.println("Количество купюр для выдачи номиналом 50: " + getPiatidesiatka());
                    System.out.println("Количество купюр для выдачи номиналом 20: " + getDvadcatka());
                }    /**
                 если сотен в хранилище меньше требуемого количества,то : */
                if (moneyStorage.getNote100() < sotnya1) {
                    sotnya1 = moneyStorage.getNote100();
                    int difference = getHowMatchMoneyTakeAway() - sotnya1 * 100;
                    piatidesiatka = difference / 50;
                    if ((getHowMatchMoneyTakeAway() - getSotnya()) % 20 == 0) {
                        dvadcatka = (getHowMatchMoneyTakeAway() - getSotnya()) / 20;
                    }
                    moneyStorage.setSumNote(moneyStorage.getSumNote() - getSotnya1() + getPiatidesiatka() + getDvadcatka());
                    System.out.println("Количество купюр для выдачи номиналом 100: " + getSotnya1());
                    System.out.println("Количество купюр для выдачи номиналом 50: " + getPiatidesiatka());
                    System.out.println("Количество купюр для выдачи номиналом 20: " + getDvadcatka());
                }
            }
        }
        getYourMoney(moneyStorage,masterCart);
    }

    public void getYourMoney(MoneyStorage moneyStorage,MasterCart masterCart) {
        System.out.println("заберите Ваши деньги:" + getHowMatchMoneyTakeAway());

        moneyStorage.setSumMoney(moneyStorage.getSumMoney() - getHowMatchMoneyTakeAway());
        System.out.println("Остаток денег в банкомате: " + moneyStorage.getSumMoney());

        System.out.println("Остаток купюр в банкомате: " + moneyStorage.getSumNote());

        masterCart.setCashInCart(masterCart.getCashInCart()-getHowMatchMoneyTakeAway());
        System.out.println("Ваш балланс равен " +masterCart.getCashInCart());
    }

    //Метод для рассчета на карточке и проверки балланса
    public void balanse(MasterCart masterCart) {
        masterCart.setCashInCart(masterCart.getCashInCart()-getHowMatchMoneyTakeAway());
        System.out.println("Ваш балланс равен " +masterCart.getCashInCart());
    }
}

