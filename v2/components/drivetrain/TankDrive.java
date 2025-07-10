package v2.components.drivetrain;

import v2.components.motors.*;
import com.yourcompany.robotsim.util.Vector2d;

public class TankDrive extends Drivetrain {
    private final Motor leftMotor;
    private final Motor rightMotor;

    public TankDrive(Motor leftMotor, Motor rightMotor) {
        this.leftMotor = leftMotor;
        this.rightMotor = rightMotor;
    }

    @Override
    public void drive(Vector2d velocity, double rotationalVelocity) {
        double leftPower = velocity.getY() + rotationalVelocity;
        double rightPower = velocity.getY() - rotationalVelocity;
        leftMotor.setPower(leftPower);
        rightMotor.setPower(rightPower);
    }

    @Override
    public void update(double deltaTime) {
        leftMotor.getEncoder().update(deltaTime);
        rightMotor.getEncoder().update(deltaTime);
    }
}