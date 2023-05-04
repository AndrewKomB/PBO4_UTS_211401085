// RemoteControlCar.java

public class RemoteControlCar {
    private int speed;
    private boolean isMoving;
    private String direction;

    public RemoteControlCar() {
        this.speed = 0;
        this.isMoving = false;
        this.direction = "none";
    }

    public void accelerate() {
        this.speed += 10;
        this.isMoving = true;
    }

    public void decelerate() {
        if (this.speed >= 10) {
            this.speed -= 10;
        } else {
            this.speed = 0;
            this.isMoving = false;
        }
    }

    public void turnLeft() {
        this.direction = "left";
    }

    public void turnRight() {
        this.direction = "right";
    }

    public void stop() {
        this.speed = 0;
        this.isMoving = false;
        this.direction = "none";
    }

    public void displayCarStatus() {
        System.out.println("Speed: " + this.speed);
        System.out.println("Moving: " + this.isMoving);
        System.out.println("Direction: " + this.direction);
    }
}
