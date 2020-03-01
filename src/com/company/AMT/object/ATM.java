package company.AMT.object;

import java.io.IOException;

public class ATM {
    private int note20;
    private int note50;
    private int note100;
    private int sumNote;
    private int sumMoney;

    public ATM(int note20, int note50, int note100) {
        this.note20 = note20;
        this.note50 = note50;
        this.note100 = note100;
    }

    public ATM(int sumNote, int sumMoney) {
        this.sumNote = sumNote;
        this.sumMoney = sumMoney;
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

    public ATM() {
    }

    public static void main(String[] args) throws IOException {
        ATM atm = new ATM();
        InPut inPut = new InPut(0,0,0,0,0);
        OutPut outPut = new OutPut();
        Variator variator = new Variator();
        Storage storage = new Storage(200,500,1000,170,165000);

        inPut.start();



    }}













//
//
//        atm.setNameAndAge("ccccccccc",22);
//        atm.inPutMoney();
//        atm.setAge(33);
//        atm2.setAge(35);
//        atm2.setNameAndAge("qqqqqqqq",44);
//atm.inPutMoney();
//atm2.inPutMoney();
//    }
//
//    void inPutMoney() {
//        System.out.println("имя" + name + "xsx " + age);
//    }
//
//    void setNameAndAge(String userName,int userAge) {
//        name = userName;
//        age = userAge;
//    }
//void setAge(int userAge){
//        age = userAge;
//}
//
//}
//
//
//
