package company.dz5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoneyOutput {
    public static void outPutMoney() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите сумму денег которую хотите снять");
        String sage = reader.readLine();
        int howMatchMoneyTakeAway = Integer.parseInt(sage);

        if ((howMatchMoneyTakeAway % 100 != 20) || (howMatchMoneyTakeAway % 100 != 40) || (howMatchMoneyTakeAway % 100 != 60)
                || (howMatchMoneyTakeAway % 100 != 80) || (howMatchMoneyTakeAway % 100 != 0) || (howMatchMoneyTakeAway % 100 != 50)) {
            System.out.println("Банкомат не может выдать такую сумму, введите сумму кратную 20 или 50");
        }

        MoneyValidator.calculateMoney();//запрос в валидатор какими купюрами выдавать и есть-ли такая сумма в хранилище


        System.out.println("Заберите Ваши деньги");

    }
}
