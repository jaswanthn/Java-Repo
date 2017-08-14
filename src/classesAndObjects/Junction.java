package classesAndObjects;

public class Junction {
    public static  void main(String[] args) {
        TrafficPolice tp = new TrafficPolice();
        tp.controlTraffic();
    }
}

class TrafficPolice {
    void controlTraffic() {
        System.out.println("controlling traffic");
    }
}
