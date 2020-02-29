package company.dz5;


public class MoneyValidator {
    /**
     запрос в хранилище - есть -ли такая сумма
    Рассчет какими купюрами выдавать
     */

    public static void calculateMoney() {

      Boolean howSum =  MoneyStorage.howMatchMoneyTakeAway();//запрос в хранилище - есть -ли такая сумма,если возвращает тру,то
        // рассчитываем какими купюрами выдавать
       if(howSum=true){
           int howMatchMoneyTakeAway;
        }
        int sumNote20;
        int sumNote50;
        int sumNote100;
        int sumNote=sumNote20+sumNote50+sumNote100;
        int sumInputMoney=sumNote20*20+sumNote50*50+sumNote100*100;


    }
}
