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

        while (true) {
            String eWalletNumber = null;
            try {
                eWalletNumber = reader.readLine();
                Pattern pattern = Pattern.compile("\\s*[EDR]\\s*\\d{12}\\s*");//не разобрался как сделать,чтобы пробел мог быть
                                                                              // в любом месте, почитаю еще
                Matcher matcher = pattern.matcher(eWalletNumber);
                if (matcher.matches()) {
                    System.out.println("Electronic wallet number Valid");
                } else {
                    System.out.println("Electronic wallet number must be in the form : [A]XXXXXXXXXXXX");
                }
            } catch (IOException e) {
                System.out.println("IO mistake");
            }
        }
    }
}

