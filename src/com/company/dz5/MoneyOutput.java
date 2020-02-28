package company.dz5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoneyOutput {
    public static int outPutMoney() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите сумму денег");

        String sage = reader.readLine();
        int howMatchMoney = Integer.parseInt(sage);
        if((howMatchMoney%20==0)||(howMatchMoney%50==0)){
            System.out.println("Банкомат не может выдать такую сумму, введите сумму кратную 20 или 50");}

        return howMatchMoney;
    }
}
