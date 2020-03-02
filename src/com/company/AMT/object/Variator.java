package company.AMT.object;


public class Variator {
    private int piatidesiatka;
    private int sotnya;
    private int sotnya1;
    private int dvadcatka;
    private int sumNoteOutput;
    private int sumMoneyOutput;


    public Variator(int piatidesiatka, int sotnya, int sotnya1, int dvadcatka, int sumNoteOutput, int sumMoneyOutput) {
        this.piatidesiatka = piatidesiatka;
        this.sotnya = sotnya;
        this.sotnya1 = sotnya1;
        this.dvadcatka = dvadcatka;
        this.sumNoteOutput = sumNoteOutput;
        this.sumMoneyOutput = sumMoneyOutput;
    }

    public int getSumMoneyOutput() {
        return sumMoneyOutput;
    }

    public void setSumMoneyOutput(int sumMoneyOutput) {
        this.sumMoneyOutput = sumMoneyOutput;
    }

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

    /**
     * проверяем есть-ли в банкомате столько денег
     */
    public void fromOutPutToValidator(OutPut outPut, Storage storage) {

        System.out.println(storage.getSumMoney());
        System.out.println(outPut.getHowMatchMoneyTakeAway());
        if (storage.getSumMoney() > outPut.getHowMatchMoneyTakeAway()) {
            /**
             рассчитываем какими купюрами выдавать
             */
            if (outPut.getHowMatchMoneyTakeAway() <= 10000) {
                sotnya = outPut.getHowMatchMoneyTakeAway() / 100 * 100;
                sotnya1 = outPut.getHowMatchMoneyTakeAway() / 100;

                if (storage.getNote100() > sotnya1) {//проверка хватит-ли сотен в хранилице,для выдачи,если да,то:
                    if (outPut.getHowMatchMoneyTakeAway() - getSotnya() == 50) {
                        piatidesiatka = 1;
                    }
                    if ((outPut.getHowMatchMoneyTakeAway() - getSotnya()) % 20 == 0) {

                        dvadcatka = (outPut.getHowMatchMoneyTakeAway() - getSotnya()) / 20;
                    }
                    sumMoneyOutput = getDvadcatka() * 20 + getPiatidesiatka() * 50 + getSotnya1() * 100;
                    sumNoteOutput = getSotnya1() + getPiatidesiatka() + getDvadcatka();
                    System.out.println("Количество купюр для выдачи номиналом 100: " + getSotnya1());
                    System.out.println("Количество купюр для выдачи номиналом 50: " + getPiatidesiatka());
                    System.out.println("Количество купюр для выдачи номиналом 20: " + getDvadcatka());
                }    /**
                 если сотен в хранилище меньше требуемого количества,то : */
                if (storage.getNote100() < sotnya1) {

                    sotnya1 = storage.getNote100();

                    int difference = outPut.getHowMatchMoneyTakeAway() - sotnya1 * 100;

                    piatidesiatka = difference / 50;

                    if ((outPut.getHowMatchMoneyTakeAway() - getSotnya()) % 20 == 0) {

                        dvadcatka = (outPut.getHowMatchMoneyTakeAway() - getSotnya()) / 20;

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

        } else {
            System.out.println("В dsvsvsvбанкомате нет такого количества денег");

        }
    }
}








