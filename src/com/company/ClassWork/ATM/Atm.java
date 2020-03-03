package company.ClassWork.ATM;

import java.io.IOException;

public class Atm {
    public static void main(String[] args) throws IOException {
     MasterCart masterCart = new MasterCart(5000);
     UserInterface userInterface= new UserInterface();

        masterCart.pin(userInterface,masterCart);


    }
}
