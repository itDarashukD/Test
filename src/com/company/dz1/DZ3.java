package company.dz1;
//
public class DZ3 {


   //количество суток и недель
        public static void main(String[] args) {
            int s = 4646840;
            int sec, m, min, h, syt, ned, hours, n, h1;
             sec = s % 60;
            m = (s - sec) / 60;
            min = m % 60;
            h = (m - min) / 60;
            hours = h % 24;
            n = (h - hours) / 24;
            syt = n % 7;
            ned = (n - syt) / 7;
            System.out.println(ned + " недель " + syt + " суток " + hours + " часов " + min + " минут " + sec + " секунд ");
        }

    }


