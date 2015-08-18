package ncarneiro.org.onward;

/**
 * Created by Nikolas on 18/08/2015.
 */
public class Car {

    private double torque;
    private double consumption;
    private double maxSpeed;
    private int boosts;

    public Car(){
        this.torque = 1;
        this.consumption = 1;
        this.maxSpeed = 100;
        this.boosts = 3;
    }

    public Car(double torque, double consumption, double maxSpeed, int boosts) {
        this.torque = torque;
        this.consumption = consumption;
        this.maxSpeed = maxSpeed;
        this.boosts = boosts;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getBoosts() {
        return boosts;
    }

    public void setBoosts(int boosts) {
        this.boosts = boosts;
    }

}