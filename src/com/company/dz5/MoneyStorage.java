package company.dz5;

public class MoneyStorage {

    private int note20;
    private int note50;
    private int note100;
    private int sumNote = note20 + note50 + note100;
    private int sumMoney = note20 * 120 + note50 * 150 + note100 * 100;

    public MoneyStorage(int note20, int note50, int note100) {
        this.note20 = note20;
        this.note50 = note50;
        this.note100 = note100;

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
}