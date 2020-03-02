package company.AMT.object;

import company.dz5.MoneyInput;
import company.dz5.MoneyStorage;
import company.dz5.MoneyValidator;

public class Storage {

    private int note20;
    private int note50;
    private int note100;
    private int sumNote;
    private int sumMoney;

    public Storage(int note20, int note50, int note100, int sumNote, int sumMoney) {
        this.note20 = note20;
        this.note50 = note50;
        this.note100 = note100;
        this.sumNote = getNote20() + getNote50() + getNote100();
        this.sumMoney = getNote20() * 20 + getNote50() * 50 + getNote100() * 100;
    }

    public int getNote20() {
        return note20;
    }

    public void setNote20(int note20) {
        this.note20 = note20;
    }

    public int getNote50() {
        return note50;
    }

    public void setNote50(int note50) {
        this.note50 = note50;
    }

    public int getNote100() {
        return note100;
    }

    public void setNote100(int note100) {
        this.note100 = note100;
    }

    public int getSumNote() {
        return sumNote;
    }

    public void setSumNote(int sumNote) {
        this.sumNote = sumNote;
    }

    public int getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(int sumMoney) {
        this.sumMoney = sumMoney;
    }

    /**
     * передаем в хранилище количество купюр которое вставлено в банкомат
     */

    public void fromInPutToStorage(InPut inPut) {
        note20 = getNote20() + inPut.getInputSumNote20();
        note50 = getNote50() + inPut.getInputSumNote50();
        note100 = getNote100() + inPut.getInputSumNote100();
        sumNote = getSumNote() + inPut.getInputSumNote();
        sumMoney = getSumMoney() + inPut.getInputSumMoney();
        System.out.println("На данный момент в хранилище находится 20-ток: " + getNote20() + "; 50-ток: " + getNote50() + ";" +
                " 100-к: " + getNote100());

    }
    /**
     * передаем в хранилище количество купюр которое будем выдавать и
     * вычитаем выданные купюры. Считаем сколько денег останется в хранилище после выдачи
     */

    public void howMachNoteMoneyTakeAway(Variator variator) {
        note20 = getNote20() - variator.getDvadcatka();
        note50 = getNote50() - variator.getPiatidesiatka();
        note100 = getNote100() - variator.getSotnya1();
        sumNote = getSumNote() - variator.getSumNoteOutput();
        sumMoney = getSumMoney() - variator.getSumMoneyOutput();
        System.out.println("На данный момент в хранилище находится сумма: " + getSumMoney());
    }
}



