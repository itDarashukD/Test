package com.company.dz2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Auto {
    public int a;
    private String dataVupyska;
    private int bak;
    private int rashod;
    private String name;

    public Auto(String godVupyska, int bak, int rashod, String name) {
        this.dataVupyska = godVupyska;
        this.bak = bak;
        this.rashod = rashod;
        this.name = name;
    }

    public String getGodVupyska() {
        return dataVupyska;
    }

    public void setGodVupyska(String godVupyska) {
        this.dataVupyska = godVupyska;
    }

    public int getBak() {
        return bak;
    }

    public void setBak(int bak) {
        this.bak = bak;
    }

    public int getRashod() {
        return rashod;
    }

    public void setRashod(int rashod) {
        this.rashod = rashod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int put(Auto our) {
        return getRashod() * getBak();
    }
    /**
     * создаем методы расчета возраста машин с  использование стандартного метода дат в java и его преобразованием
        */
    public String old(Auto golf) {
        Date dateNow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("Текущая дата " + format.format(dateNow));

        String date1 = format.format(dateNow);
        String date2 = golf.getGodVupyska();
        Date dateOne = null;
        Date dateTwo = null;
        try {
            dateOne = format.parse(date1);
            dateTwo = format.parse(date2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Количество дней между датами в миллисекундах
        long difference = dateOne.getTime() - dateTwo.getTime();
        // Перевод количества дней между датами из миллисекунд в дни и годы
        int days = (int) (difference / (24 * 60 * 60 * 1000)); // миллисекунды / (24ч * 60мин * 60сек * 1000мс)
        int year = days / 365;
        int ostdays = days % 365;
        // Вывод разницы между датами в днях на экран
        System.out.println(getName() + "у с момента производства " + year + " лет " + ostdays + " дней");

        a = year;

        Integer a = Integer.parseInt(String.valueOf(year));


        return " ";

    }
}




