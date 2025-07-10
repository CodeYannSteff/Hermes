package v2.components.servos;



public class Servo {
    private double currentPosition;
    private final double minPosition;
    private final double maxPosition;

    public Servo(double minPosition, double maxPosition) {
        this.minPosition = minPosition;
        this.maxPosition = maxPosition;
        this.currentPosition = minPosition;
    }

    public void setPosition(double position) {
        this.currentPosition = Math.max(minPosition, Math.min(maxPosition, position));
    }

    public double getPosition() {
        return currentPosition;
    }
}