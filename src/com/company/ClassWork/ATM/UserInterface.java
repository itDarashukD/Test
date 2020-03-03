package company.ClassWork.ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInterface {

    private MoneyService moneyService = new MoneyService();
    private MoneyStorage moneyStorage = new MoneyStorage(200, 500, 1000, 170, 129000);

    public void menu(MasterCart masterCart) throws IOException {
        System.out.println("Банкомат принемает и выдает купюры номиналом 20 ,50 ,100 ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите требуемую операцию: пополнение денег:  1  , снятие денег: 2 ,проверка баланса : 3");

        String sage = reader.readLine();
        int nameOperation = Integer.parseInt(sage);

        switch (nameOperation) {
            case 1:
                moneyService.inPutMoneyInAtm( moneyStorage);
                break;
            case 2:
                moneyService.outPutMoneyFromAtm(moneyStorage, masterCart);
                break;
            case 3:
                moneyService.balanse(masterCart);
                break;
            default:
                System.out.println("Такой операции не существует, введите верный номер операции");
                menu(masterCart);

        }
    }
}
