package company.dz5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoneyInput {
  private static   int inputSumNote20;
  private  static int inputSumNote50 ;
  private  static int inputSumNote100 ;

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

    public static void start() throws IOException {
        System.out.println("Банкомат принемает купюры номиналом 20,50,100р");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите требуемую операцию: пополнение денег в банкомате - (inPutMoney)  или снятие денег - (outPutMoney) ");

        String nameOperation = reader.readLine();
        if (nameOperation.equals("inPutMoney")) {
            money();

        }
        if (nameOperation.equals("outPutMoney")) {
            MoneyOutput.outPutMoney();

        }
        if (((!nameOperation.equals("outPutMoney"))) && (!nameOperation.equals("inPutMoney"))) {
            System.out.println("Введенная опереция не существует, введите верное имя операции");
        }
    }

    public static void money() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Засуньте купюры в купюроприемник, по окончании нажмите: 0 ");

        while (true){

            String sage = reader.readLine();
            int howMatchMoney = Integer.parseInt(sage);
            if((howMatchMoney!=20)&&(howMatchMoney!=50)&&(howMatchMoney!=100)){
                System.out.println("Купюры такого номинала не принемаются, внесите купюры 20 ,50, 100");}
            if(howMatchMoney == 20){setInputSumNote20(inputSumNote20++);}
            if(howMatchMoney == 50){setInputSumNote50(inputSumNote50++);}
            if(howMatchMoney == 100){setInputSumNote100(inputSumNote100++);}

            if(howMatchMoney==0){
                break; }}

/**
 как передать полученные значения количества разных купюр и общее количество денег в хранилище?
 */
            int inputSumNote=getInputSumNote20()+getInputSumNote50()+getInputSumNote100();
            int InputSumMoney=getInputSumNote20()*20+getInputSumNote50()*50+getInputSumNote100()*100;
            System.out.println("Количество купюр номиналом 20 положено в банкомат: " + getInputSumNote20());
            System.out.println("Количество купюр номиналом 50 положено в банкомат: " + getInputSumNote50());
            System.out.println("Количество купюр номиналом 100 положено в банкомат: " + getInputSumNote100());
            System.out.println("Общее количество купюр номиналом 20,50,100 положено в банкомат: " + inputSumNote);
            System.out.println("Сумма положенная в банкомат равна: " + InputSumMoney);


    }


}
