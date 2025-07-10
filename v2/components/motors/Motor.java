package v2.components.motors;

public class Motor {
    private final MotorType motorType;
    private double power = 0.0;
    private Encoder encoder;

    public Motor(MotorType motorType) {
        this.motorType = motorType;
        this.encoder = new Encoder(this);
    }

    public void setPower(double power) {
        this.power = Math.max(-1.0, Math.min(1.0, power));
    }

    public double getPower() {
        return power;
    }

    public MotorType getMotorType() {
        return motorType;
    }

    public Encoder getEncoder() {
        return encoder;
    }
}