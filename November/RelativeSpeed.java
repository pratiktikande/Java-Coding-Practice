package November;

public class RelativeSpeed {
    public static int relativeSpeed(int direction, int distancel, int timel, int distance2, int time2) {
        int speed1 = distancel / timel;
        int speed2 = distance2 / time2;

        int relativeSpeed;
        if (direction == 0) {
            relativeSpeed = speed1 + speed2;
        } else if (direction == 1) {
            relativeSpeed = speed1 - speed2;
        } else {
            throw new IllegalArgumentException("Invalid direction");
        }

        return relativeSpeed;
    }

    public static void main(String[] args) {
        int direction = 0;
        int distancel = 30;
        int timel = 5;
        int distance2 = 20;
        int time2 = 10;

        int relativeSpeed = relativeSpeed(direction, distancel, timel, distance2, time2);

        System.out.println("Relative speed: " + relativeSpeed);
    }
}
