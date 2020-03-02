package company.AMT.object;

import company.dz5.MoneyOutput;
import company.dz5.MoneyStorage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InPut {
    private int inputSumNote20;
    private int inputSumNote50;
    private int inputSumNote100;
    private int inputSumNote;
    private int inputSumMoney;

    public InPut(int inputSumNote20, int inputSumNote50, int inputSumNote100, int inputSumNote, int inputSumMoney) {
        this.inputSumNote20 = inputSumNote20;
        this.inputSumNote50 = inputSumNote50;
        this.inputSumNote100 = inputSumNote100;
        this.inputSumNote = inputSumNote;
        this.inputSumMoney = inputSumMoney;
    }

    public int getInputSumNote20() {
        return inputSumNote20;
    }

    public void setInputSumNote20(int inputSumNote20) {
        this.inputSumNote20 = inputSumNote20;
    }

    public int getInputSumNote50() {
        return inputSumNote50;
    }

    public void setInputSumNote50(int inputSumNote50) {
        this.inputSumNote50 = inputSumNote50;
    }

    public int getInputSumNote100() {
        return inputSumNote100;
    }

    public void setInputSumNote100(int inputSumNote100) {
        this.inputSumNote100 = inputSumNote100;
    }

    public int getInputSumNote() {
        return inputSumNote;
    }

    public void setInputSumNote(int inputSumNote) {
        this.inputSumNote = inputSumNote;
    }

    public int getInputSumMoney() {
        return inputSumMoney;
    }

    public void setInputSumMoney(int inputSumMoney) {
        this.inputSumMoney = inputSumMoney;
    }

    public void start() throws IOException {
        System.out.println("Банкомат принемает и выдает купюры номиналом 20 ,50 ,100 ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите требуемую операцию: пополнение денег:  1  или снятие денег: 2 ");

        String sage = reader.readLine();
        int nameOperation = Integer.parseInt(sage);
        if (nameOperation == 1) {

            inPutmoney();
        }
        if (nameOperation == 2) {
            outPut.outPutStart(); //  Хчу вызвать метод public void outPutStart из outPut

        }
        if (((nameOperation != 1)) && (nameOperation != 2)) {
            System.out.println("Введенная опереция не существует, введите верный номер операции");
        }
    }


    private void inPutmoney() throws IOException {
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
    }
    /**
     * рассчет общего количество внесенных купюр и денег
     */

        public void howManyMoneyInPut() {

        inputSumNote = getInputSumNote20() + getInputSumNote50() + getInputSumNote100();
        inputSumMoney = getInputSumNote20() * 20 + getInputSumNote50() * 50 + getInputSumNote100() * 100;
        System.out.println("Количество купюр номиналом 20 положено в банкомат: " + getInputSumNote20());
        System.out.println("Количество купюр номиналом 50 положено в банкомат: " + getInputSumNote50());
        System.out.println("Количество купюр номиналом 100 положено в банкомат: " + getInputSumNote100());
        System.out.println("Общее количество купюр номиналом 20,50,100 положено в банкомат: " + getInputSumNote());
        System.out.println("Сумма положенная в банкомат равна: " + getInputSumMoney());
    }


}