package company.dz5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoneyInput {

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
        int sumNote20=0;
        int sumNote50=0;
        int sumNote100=0;

        while (true){

            String sage = reader.readLine();
            int howMatchMoney = Integer.parseInt(sage);
            if((howMatchMoney!=20)&&(howMatchMoney!=50)&&(howMatchMoney!=100)){
                System.out.println("Купюры такого номинала не принемаются, внесите купюры 20 ,50, 100");}
            if(howMatchMoney == 20){sumNote20++;}
            if(howMatchMoney == 50){sumNote50++;}
            if(howMatchMoney == 100){sumNote100++;}

            if(howMatchMoney==0){
                break; }}

/**
 как передать полученные значения количества разных купюр и общее количество денег в хранилище?
 */
            int sumNote=sumNote20+sumNote50+sumNote100;
            int sumInputMoney=sumNote20*20+sumNote50*50+sumNote100*100;
            System.out.println("Количество купюр номиналом 20 положено в банкомат: " + sumNote20);
            System.out.println("Количество купюр номиналом 50 положено в банкомат: " + sumNote50);
            System.out.println("Количество купюр номиналом 100 положено в банкомат: " + sumNote100);
            System.out.println("Общее количество купюр номиналом 20,50,100 положено в банкомат: " + sumNote);
            System.out.println("Сумма положенная в банкомат равна: " + sumInputMoney);

        }
}
