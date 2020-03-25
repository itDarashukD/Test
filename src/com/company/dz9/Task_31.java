package company.dz9;

public class Task_31 {
    public static void main(String[] args) {

        // для группировки найденных цифр и парсинга каждой группы в число
        StringBuilder sb = new StringBuilder();
        // для вывода строки-списка найденных чисел
        StringBuilder sbout = new StringBuilder();

        String s = "fwf3432c2c2c243c";
        // посимвольный перебор текста
        int i = 0;
        while (i < s.length()) {
            // проверка на принадлежность к цифрам
            if (Character.isDigit(s.charAt(i))) {

                // если текущий символ это цифра, то добавляем его в строку;
                // увеличиваем индекс и смотрим сразу следующий символ;
                // если будет не_цифра, то выйдем из текущего while
                while (Character.isDigit(s.charAt(i))) {
                    sb.append(s.charAt(i));
                    i++;

                    // защита от выхода счётчика i за пределы длины строки,
                    // если последний символ в тексте - это цифра
                    if (i == s.length())
                        break;
                } // выходим из while, имея группу цифр в объекте sb
int sum = 0;
                int k = Integer.parseInt(sb.toString()); // парсинг sb в число


                sbout.append(k + ", "); // формирование строки-списка найденных
                // чисел
                System.out.println(k);
                sum += k; // подсчёт суммы
             //   System.out.println(sum);
                sb.delete(0, sb.length()); // очистка sb для повторного
                // использования

            } else
                // если текущий символ - это не_цифра,
                // просто переходим к следующему
                i++;
        }

        if (sbout.length() == 0) {
            // если список найденных чисел пуст
            System.out.println("Чисел в тексте не найдено");
        } else {
            System.out.println("Найденные в тексте числа: ");
            // удаление лишних запятой и пробела, добавленных в конце списка
            System.out.println(sbout.delete(sbout.length() - 2,
                    sbout.length() - 1));
            //System.out.println("Сумма чисел в заданном тексте = " + sum);
        }
    }



}