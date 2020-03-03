package company.ClassWork.ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MasterCart {

  private int truePinCod = 1111;
  int cashInCart;

    public MasterCart(int cashInCart) {
        this.cashInCart = cashInCart;
    }

    public int getCashInCart() {
        return cashInCart;
    }

    public void setCashInCart(int cashInCart) {
        this.cashInCart = cashInCart;
    }

    public void pin(UserInterface userInterface, MasterCart masterCart) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


       for (int i=1;i<=3;i++){
            System.out.println("Введите свой PIN-код");
            String sage = reader.readLine();
            int pinCod = Integer.parseInt(sage);

            if (pinCod != truePinCod){
                System.out.println("Введен не верный пин код , осталось "+(3-i)+" попытки, повторите ввод");
            }
           else {userInterface.menu(masterCart);
           break;}
            }
        }
    }

