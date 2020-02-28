package company.dz5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoneyInput {
private int sumMoney=0;
private int sumNote20=0;
    private int sumNote50=0;

    public int getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(int sumMoney) {
        this.sumMoney = sumMoney;
    }

    public int getSumNote20() {
        return sumNote20;
    }

    public void setSumNote20(int sumNote20) {
        this.sumNote20 = sumNote20;
    }

    public int getSumNote50() {
        return sumNote50;
    }

    public void setSumNote50(int sumNote50) {
        this.sumNote50 = sumNote50;
    }

    public int getSumNote100() {
        return sumNote100;
    }

    public void setSumNote100(int sumNote100) {
        this.sumNote100 = sumNote100;
    }

    public int getSumNote() {
        return sumNote;
    }

    public void setSumNote(int sumNote) {
        this.sumNote = sumNote;
    }

    private int sumNote100=0;
    private int sumNote=sumNote20+sumNote50+sumNote100;

    public static void start() throws IOException {
        System.out.println("Банкомат принемает купюры номиналом 20,50,100р");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите требуемую операцию: пополнение денег в банкомате - (inPutMoney)  или снятие денег - (outPutMoney) ");

        String nameOperation = reader.readLine();
        if (nameOperation.equals("inPutMoney")) {
            inPutMoney();

        }
        if (nameOperation.equals("outPutMoney")) {
            MoneyOutput.outPutMoney();

        }
        if (((!nameOperation.equals("outPutMoney"))) && (!nameOperation.equals("inPutMoney"))) {
            System.out.println("Введенная опереция не существует, введите верное имя операции");
        }

    }
    private static void inPutMoney() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Засуньте купюры в купюроприемник, по окончании нажмите: 0 ");
        String sage = reader.readLine();
        int howMatchMoney = Integer.parseInt(sage);
        while (howMatchMoney==0){


            if((howMatchMoney%20==0)||(howMatchMoney%50==0)){
                System.out.println("Купюры такого номинала не принемаются, внесите купюры 20 ,50, 100");}
            if(howMatchMoney == 20){setSumNote20++;}
            if(howMatchMoney == 50){setSumNote50++;}
            if(howMatchMoney == 100){setSumNote100++;}


    }
}}
