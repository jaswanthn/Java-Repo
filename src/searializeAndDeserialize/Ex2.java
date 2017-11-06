package searializeAndDeserialize;

import java.io.*;

public class Ex2 {

    public static void main(String[] args) {

        try {
            FileOutputStream fo = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fo);

            Student s1 = new Student(10001, "Kiran", 9010223380l);
            Student s2 = new Student(10002, "Mahesh", 9848226110l);
            Student s3 = new Student(10003, "Vinod", 9013434238l);

            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.writeObject(s3);

            FileInputStream fi = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fi);

            while(true) {
                Student s = (Student) ois.readObject();
                if (s == null) break;
                System.out.println(s);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
