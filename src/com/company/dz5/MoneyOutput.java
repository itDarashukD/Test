package company.dz5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoneyOutput {
    private static int howMatchMoneyTakeAway;

    public static int getHowMatchMoneyTakeAway() {
        return howMatchMoneyTakeAway;
    }

    public static void setHowMatchMoneyTakeAway(int howMatchMoneyTakeAway) {
        MoneyOutput.howMatchMoneyTakeAway = howMatchMoneyTakeAway;
    }

    public static void outPutMoney() throws IOException {
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
            else {
                MoneyValidator.calculateMoney();
            }
        }
    }

    public static void howMatchMoneyTakeAwayOutMoney() {
        System.out.println("Заберите Ваши деньги: " + getHowMatchMoneyTakeAway());

    }
}
