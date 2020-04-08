package company.dz12;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 Напишите программу, моделирующую кассы в магазине. Существует несколько касс, работающих одновременно.
 Каждый покупатель — отдельный поток. Общее количество покупателей может быть больше чем количество касс,
 но одновременно не может обрабатываться больше покупателей чем имеется рабочих касс.
 У каждого покупателя есть набор товаров, которые должны быть выведены в процессе обслуживания.
 */
public class Buyer extends Thread {

    private Lock lock;

    public Buyer(String name) {
        super(name);

        this.lock = new ReentrantLock();
    }

    @Override
    public void run() {
        lock.lock();

        System.out.println(this.getName() + " купил: " + "на кассе № " + CashDesk.getCachDesk() + " " +
                CashDesk.getGoods());

        lock.unlock();
    }
}