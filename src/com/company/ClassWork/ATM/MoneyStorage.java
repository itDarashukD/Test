package company.ClassWork.ATM;

public class MoneyStorage {
    private int note20;
    private int note50;
    private int note100;
    private int sumNote;
    private int sumMoney;


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

    public MoneyStorage(int note20, int note50, int note100, int sumNote, int sumMoney) {
        this.note20 = note20;
        this.note50 = note50;
        this.note100 = note100;
        this.sumNote = sumNote;
        this.sumMoney = sumMoney;
    }





}
