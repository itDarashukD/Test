package company.AMT.object;

import company.dz5.MoneyValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OutPut {
    private int howMatchMoneyTakeAway;


    public int getHowMatchMoneyTakeAway() {
        return howMatchMoneyTakeAway;
    }

    public void setHowMatchMoneyTakeAway(int howMatchMoneyTakeAway) {
        this.howMatchMoneyTakeAway = howMatchMoneyTakeAway;
    }

   private void outPut(int howMatchMoneyTakeAway) {
        this.howMatchMoneyTakeAway = howMatchMoneyTakeAway;
    }

    public void outPutStart(InPut inPut) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
/**
 проверка на кратность снмаемой суммы
 */
        System.out.println("Введите сумму денег которую хотите снять, максимальная сумма 10000");
        while (true) {
            String sage = reader.readLine();
            howMatchMoneyTakeAway = Integer.parseInt(sage);

            if ((getHowMatchMoneyTakeAway() % 100 != 20) && (getHowMatchMoneyTakeAway() % 100 != 40) &&
                    (getHowMatchMoneyTakeAway() % 100 != 60) && (getHowMatchMoneyTakeAway() % 100 != 80) &&
                    (getHowMatchMoneyTakeAway() % 100 != 0) && (getHowMatchMoneyTakeAway() % 100 != 50)) {
                System.out.println("Банкомат не может выдать такую сумму, введите сумму кратную 20 или 50");
            } /**
             запрос в валидатор какими купюрами выдавать и есть-ли такая сумма в хранилище
             */

        }
    }

    public void getYourMoney() {
        System.out.println("заберите Ваши деньги:" + getHowMatchMoneyTakeAway());
    }
}
