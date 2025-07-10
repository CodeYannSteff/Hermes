package v2.components.motors;

public enum MotorType {
    CORE_HEX(288),
    GOBILDA_5202(550),
    NEVEREST_20(105);

    private final double rpm;

    MotorType(double rpm) {
        this.rpm = rpm;
    }

    public double getRpm() {
        return rpm;
    }
}