package company.dz5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoneyInput {
    private static int inputSumNote20;
    private static int inputSumNote50;
    private static int inputSumNote100;

    private static int inputSumNote;
    private static int InputSumMoney;

    public static int getInputSumNote() {
        return inputSumNote;
    }

    public static void setInputSumNote(int inputSumNote) {
        MoneyInput.inputSumNote = inputSumNote;
    }

    public static int getInputSumMoney() {
        return InputSumMoney;
    }

    public static void setInputSumMoney(int inputSumMoney) {
        InputSumMoney = inputSumMoney;
    }

    public static int getInputSumNote20() {
        return inputSumNote20;
    }

    public static void setInputSumNote20(int inputSumNote20) {
        MoneyInput.inputSumNote20 = inputSumNote20;
    }

    public static int getInputSumNote50() {
        return inputSumNote50;
    }

    public static void setInputSumNote50(int inputSumNote50) {
        MoneyInput.inputSumNote50 = inputSumNote50;
    }

    public static int getInputSumNote100() {
        return inputSumNote100;
    }

    public static void setInputSumNote100(int inputSumNote100) {
        MoneyInput.inputSumNote100 = inputSumNote100;
    }
    /**
Начало работы
     */
    public void start() throws IOException {
        System.out.println("Банкомат принемает и выдает купюры номиналом 20 ,50 ,100 ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите требуемую операцию: пополнение денег:  1  или снятие денег: 2 ");

        String sage = reader.readLine();
        int nameOperation = Integer.parseInt(sage);
        if (nameOperation == 1) {
            money();

        }
        if (nameOperation == 2) {
            MoneyOutput.outPutMoney();

        }
        if (((nameOperation != 1)) && (nameOperation != 2)) {
            System.out.println("Введенная опереция не существует, введите верный номер операции");
        }
    }
    /**
Работа купюроприемника
     */
    public void money() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            System.out.println("Засуньте купюры в купюроприемник, по окончании нажмите: 0 ");
            String sage = reader.readLine();
            int howMatchMoney = Integer.parseInt(sage);
            if (howMatchMoney == 0) {
                break;
            }/**
проверка на номинал
             */
            if ((howMatchMoney != 20) && (howMatchMoney != 50) && (howMatchMoney != 100)) {
                System.out.println("Купюры такого номинала не принемаются, внесите купюры 20 ,50, 100");
            }
            if (howMatchMoney == 20) {
                inputSumNote20++;
            }
            if (howMatchMoney == 50) {
                inputSumNote50++;
            }
            if (howMatchMoney == 100) {
                inputSumNote100++;
            }


        }

/**
 рассчет общего количество внесенных купюр и денег
 */
        inputSumNote = getInputSumNote20() + getInputSumNote50() + getInputSumNote100();
        InputSumMoney = getInputSumNote20() * 20 + getInputSumNote50() * 50 + getInputSumNote100() * 100;
        System.out.println("Количество купюр номиналом 20 положено в банкомат: " + getInputSumNote20());
        System.out.println("Количество купюр номиналом 50 положено в банкомат: " + getInputSumNote50());
        System.out.println("Количество купюр номиналом 100 положено в банкомат: " + getInputSumNote100());
        System.out.println("Общее количество купюр номиналом 20,50,100 положено в банкомат: " + getInputSumNote());
        System.out.println("Сумма положенная в банкомат равна: " + getInputSumMoney());

        MoneyStorage.fromInputToStorage();
    }

}
