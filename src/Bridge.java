public class Bridge {
    public static void main(String[] args){
        DispenserBridge bridge = new DispenserBridge(new Erikli(), new Bosch());

        Water w1 = bridge.cold();
        System.out.println(w1.getDegree());

        Water w2 = bridge.hot();
        System.out.println(w2.getDegree());

        Water w3 = bridge.normal();
        System.out.println(w3.getDegree());
    }
}
