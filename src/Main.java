public class Main {
    //TEST git
    public static void main(String[] args) {

        Tank justTank = new Tank();
        Tank anywareTank = new Tank(10, 10);
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(30);
        justTank.printPosition();
        anywareTank.goBackward(-700);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
        //TEST git
        //TEST git heh
    }
}