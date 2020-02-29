package company.dz5;

import sun.font.DelegatingShape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bancomat {
    public static void main(String[] args) throws IOException {
        MoneyInput input = new MoneyInput();
        MoneyStorage storage = new MoneyStorage(120, 150, 100);
        MoneyValidator validator = new MoneyValidator();
        MoneyOutput output = new MoneyOutput();

        MoneyInput.start();
    }

}


























    /*    Money money = new Money(120, 150, 100);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите требуемую операцию: пополнение денег в банкомате - (putMoney)  или снятие денег - (withdrawalMoney) ");

        String nameOperation = reader.readLine();
        if (nameOperation.equals("putMoney")) {

            System.out.println("Введите сумму денег");

            String sage = reader.readLine();
            int howMatchMoney = Integer.parseInt(sage);
if((howMatchMoney==0)||(howMatchMoney%20!=0)||(howMatchMoney%50!=0)){
    System.out.println("Введено не верное число");}


            System.out.println("положить деньги");
        } else if (nameOperation.equals("withdrawalMoney")) {
            System.out.println("снять наличные");
        } else {
            System.out.println("Введено не верное значение, начните ввод заново");
        }





    }

    private static int putMoney() {

        return " ";



    }
}
*/