package classesAndObjects;

public class Student {
    public static void main(String[] args) {
       // lecturer delivering session to student
        Lecturer l = new Lecturer();
        l.deliverLecture();

        // tutor discussing with student
        Tutor t = new Tutor();
        t.topicDiscussion();

    }
}

class Lecturer {
    void deliverLecture() {
        System.out.println("delivering lecture");
    }
}
