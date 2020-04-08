package company.dz12;

public class TaskThread01 {

    public static void main(String[] args) {

        try {
            new Buyer("покупатель 1").start();
            Buyer.sleep(1000);
            new Buyer("покупатель 2").start();
            Buyer.sleep(1000);
            new Buyer("покупатель 3").start();
            Buyer.sleep(1000);
            new Buyer("покупатель 4").start();
            Buyer.sleep(1000);
            new Buyer("покупатель 5").start();
        } catch (InterruptedException e) {
            System.out.println("блокирован поток исполнения");
        }
    }
}

