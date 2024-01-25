public class Tank {
    private int x, y;
    private int direction;
    private int fuel;
    static final String MODEL = "T34";
    static int ntanks;
    private int n;

    public Tank() {
        this(0, 0, 100);
    }
    public Tank(int x, int y) {
        this(x, y, 100);
    }
    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        n = ++ntanks;
    }

    public void turnRight(){
        if (direction == 3) direction = 0;
        else direction++;
    }
    public void turnLeft(){
        if (direction == 0) direction = 3;
        else direction--;
    }
    public void goForward(int distance) {
        if (fuel <= 0) {
            return;
        }
        else if (distance > fuel) {
            distance = fuel;
        }
        if (direction == 0) x += distance;
        else if (direction == 1) y += distance;
        else if (direction == 2) x -= distance;
        else if (direction == 3) y -= distance;
        fuel -= Math.abs(distance);
    }
    public void goBackward(int distance){
        goForward(-distance);
    }
    public void printPosition(){
        System.out.printf("The Tank %s-%d is at %d, %d now.\n",MODEL, n, x, y);
    }
}
//TEST git