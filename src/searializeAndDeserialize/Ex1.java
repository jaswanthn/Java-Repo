package searializeAndDeserialize;

import java.io.*;

public class Ex1 {

    public static void main(String[] args) {
        Account ac = new Account(1200001, "Ravi", 100001, "ravi@gmail.com");
        try {
            FileOutputStream fo = new FileOutputStream("Account.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fo);

            oos.writeObject(ac);

            FileInputStream fi = new FileInputStream("Account.ser");
            ObjectInputStream ois = new ObjectInputStream(fi);

            System.out.println(ois.readObject());


        } catch (FileNotFoundException e) {
            System.out.println("Enter valid file name");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (EOFException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
