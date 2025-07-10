package v2.components.motors;

public class Encoder {
    private final Motor motor;
    private double position = 0.0; // In revolutions

    public Encoder(Motor motor) {
        this.motor = motor;
    }

    public void update(double deltaTime) {
        // Simulate encoder ticks based on motor power and RPM
        double revolutionsPerSecond = (motor.getMotorType().getRpm() / 60.0) * motor.getPower();
        position += revolutionsPerSecond * deltaTime;
    }

    public double getPosition() {
        return position;
    }
}