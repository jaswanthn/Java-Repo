package classesAndObjects;

public class Vendor {
    public static void main(String[] args){
    Customer1 cs1 = new Customer1();
    cs1.buyDisc();
    }
}

class Customer1 {
    void buyDisc() {
        System.out.println("buying CD");
    }
}