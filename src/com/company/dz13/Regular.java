package company.dz13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Провалидировать адрес электронного  кошелька, пример начало всегда с букв 'E' 'D' 'R'
// после буквы следает 12 чисел, возможен ввод с пробелами это не должно влять на нашу проверку

public class Regular {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your electronic wallet number ");

        while (true) {
            String eWalletNumber = null;
            try {
                eWalletNumber = reader.readLine().replaceAll(" ", "");

                Pattern pattern = Pattern.compile("[EDR]\\d{12}");
                Matcher matcher = pattern.matcher(eWalletNumber);

                if (matcher.matches()) {
                    System.out.println("Electronic wallet number Valid");
                } else {
                    System.out.println("Electronic wallet number must be in the form : AXXXXXXXXXXXX");
                }
            } catch (IOException e) {
                System.out.println("IO mistake");
            }
        }
    }
}

