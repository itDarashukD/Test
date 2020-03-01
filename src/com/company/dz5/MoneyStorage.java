package company.dz5;

public class MoneyStorage {

    private static int note20;
    private static int note50;
    private static int note100;
    private static int sumNote;
    private static int sumMoney;

    public MoneyStorage(int sumNote, int sumMoney) {
        MoneyStorage.sumNote =  getNote20()+getNote50()+getNote100();
        MoneyStorage.sumMoney = getNote20()*20+getNote50()*50+getNote100()*100;
    }
    public static int getSumNote() {    // STATIC?
        return sumNote;
    }

    public void setSumNote(int sumNote) {
        MoneyStorage.sumNote = sumNote;
    }

    public static int getSumMoney() { //  STATIC?
        return sumMoney;
    }

    public void setSumMoney(int sumMoney) {
        MoneyStorage.sumMoney = sumMoney;
    }

    public static int getNote20() {
        return note20;
    }

    public static void setNote20(int note20) {
        MoneyStorage.note20 = note20;
    }

    public static int getNote50() {
        return note50;
    }

    public static void setNote50(int note50) {
        MoneyStorage.note50 = note50;
    }

    public static int getNote100() {
        return note100;
    }

    public static void setNote100(int note100) {
        MoneyStorage.note100 = note100;
    }

    public MoneyStorage(int note20, int note50, int note100) {
        MoneyStorage.note20 = note20;
        MoneyStorage.note50 = note50;
        MoneyStorage.note100 = note100;
    }
    /**
      передаем в хранилище количество купюр которое вставлено в банкомат
     */

    public static void fromInputToStorage() {
        note20 = getNote20()+MoneyInput.getInputSumNote20();
        note50 = getNote50()+MoneyInput.getInputSumNote50();
        note100 = getNote100()+MoneyInput.getInputSumNote100();
        sumNote = getSumNote()+MoneyInput.getInputSumNote();
        sumMoney = getSumMoney()+MoneyInput.getInputSumMoney();
        System.out.println("На данный момент в хранилище находится 20-ток: "+getNote20()+"; 50-ток: "+getNote50()+ ";" +
                " 100-к: " +getNote100());

    }/**
      передаем в хранилище количество купюр которое будем выдавать и
      вычитаем выданные купюры. Считаем сколько денег останется в хранилище после выдачи
     */
     public static void howMachNoteMoneyTakeAway() {
       note20 = getNote20() - MoneyValidator.getDvadcatka();
       note50 = getNote50() - MoneyValidator.getPiatidesiatka();
       note100 = getNote100() - MoneyValidator.getSotnya1();
       sumNote = getSumNote()- MoneyValidator.getSumNoteOutput();
       sumMoney = getSumMoney() - MoneyValidator.getSumMoneyOutput();
        System.out.println("На данный момент в хранилище находится сумма: "+ getSumMoney());
/**
  передаем в MoneyOutput команду на выдачу и выдаваемо сумму
 */
             MoneyOutput.howMatchMoneyTakeAwayOutMoney();
    }
}