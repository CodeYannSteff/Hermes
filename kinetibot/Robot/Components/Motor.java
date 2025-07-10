package kinetibot.Robot.Components;

public class Motor {
    Double power, position, voltage, current, rpm, loadCapacity, maxSpeed, maxTorque, gearRatio;
    Boolean hasEncoder;
    Double runPower;

    public enum MotorType {
        MOTOR_A1, MOTOR_B2, MOTOR_C3, MOTOR_D4, MOTOR_E5, MOTOR_F6, MOTOR_G7, MOTOR_H8
    }

    public Motor(MotorType type) {
        switch (type) {
            case MOTOR_A1:
                this.power = 15.0;
                this.position = 0.0;
                this.voltage = 12.0;
                this.current = 1.2;
                this.rpm = 3000.0;
                this.loadCapacity = 1.5;
                this.maxSpeed = 1.5;
                this.maxTorque = 0.5;
                this.gearRatio = 5.0;
                this.hasEncoder = true;
                break;

            case MOTOR_B2:
                this.power = 25.0;
                this.position = 0.0;
                this.voltage = 24.0;
                this.current = 1.0;
                this.rpm = 2500.0;
                this.loadCapacity = 2.0;
                this.maxSpeed = 2.2;
                this.maxTorque = 0.8;
                this.gearRatio = 4.0;
                this.hasEncoder = false;
                break;

            case MOTOR_C3:
                this.power = 10.0;
                this.position = 0.0;
                this.voltage = 6.0;
                this.current = 0.8;
                this.rpm = 1000.0;
                this.loadCapacity = 1.0;
                this.maxSpeed = 0.8;
                this.maxTorque = 0.3;
                this.gearRatio = 10.0;
                this.hasEncoder = false;
                break;

            case MOTOR_D4:
                this.power = 30.0;
                this.position = 0.0;
                this.voltage = 12.0;
                this.current = 2.5;
                this.rpm = 3200.0;
                this.loadCapacity = 2.5;
                this.maxSpeed = 2.5;
                this.maxTorque = 1.0;
                this.gearRatio = 6.0;
                this.hasEncoder = true;
                break;

            case MOTOR_E5:
                this.power = 20.0;
                this.position = 0.0;
                this.voltage = 9.0;
                this.current = 1.5;
                this.rpm = 1500.0;
                this.loadCapacity = 1.8;
                this.maxSpeed = 1.0;
                this.maxTorque = 0.6;
                this.gearRatio = 8.0;
                this.hasEncoder = true;
                break;

            case MOTOR_F6:
                this.power = 50.0;
                this.position = 0.0;
                this.voltage = 24.0;
                this.current = 2.0;
                this.rpm = 4000.0;
                this.loadCapacity = 3.0;
                this.maxSpeed = 3.0;
                this.maxTorque = 1.2;
                this.gearRatio = 3.0;
                this.hasEncoder = true;
                break;

            case MOTOR_G7:
                this.power = 12.0;
                this.position = 0.0;
                this.voltage = 6.0;
                this.current = 1.0;
                this.rpm = 1200.0;
                this.loadCapacity = 1.2;
                this.maxSpeed = 0.9;
                this.maxTorque = 0.4;
                this.gearRatio = 7.0;
                this.hasEncoder = false;
                break;

            case MOTOR_H8:
                this.power = 35.0;
                this.position = 0.0;
                this.voltage = 18.0;
                this.current = 1.9;
                this.rpm = 2800.0;
                this.loadCapacity = 2.8;
                this.maxSpeed = 2.7;
                this.maxTorque = 0.9;
                this.gearRatio = 4.5;
                this.hasEncoder = true;
                break;

            default:
                throw new IllegalArgumentException("Unknown motor type: " + type);
        }
    }

    public void setPower(double power){
        power = Math.max(-1, Math.min(1, power));
        this.runPower = power;
    }
    public double getPower(){
        return runPower;
    }
    public double getPosition(){
        return position;
    }
}
