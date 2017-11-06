package classesAndObjects;

public class AtmMachine {
    public static void main(String[] args) {
        Customer cs = new Customer();
        cs.withDrawMoney();
        cs.depositMoney();
    }
}

class Customer {

    void withDrawMoney() {
        System.out.println("withdraw money");
    }

    void depositMoney() {
        System.out.println("deposit money");
    }
}
