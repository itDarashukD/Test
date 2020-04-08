package company.dz12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CashDesk {
    public static ArrayList getGoods() {

        ArrayList<String> list = new ArrayList<>();
        Random rand = new Random();

        List<String> givenList = Arrays.asList("молоко", "хлеб", "мороженое", "пирожок",
                "спички", "арбуз", "сахар", "огурцы");

        int numberOfElements = (int) (Math.random() * 7 + 1);

        for (int i = 0; i < numberOfElements; i++) {
            int randomIndex = rand.nextInt(givenList.size());
            String randomElement = givenList.get(randomIndex);

            list.add(randomElement);
        }

        return list;
    }

    public static int getCachDesk() {
        return (int) (Math.random() * 3 + 1);
    }

}
