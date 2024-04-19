package April18;


public class Vehicle extends Crashable implements Drivable {
    int numberOfWheels = 4;
    double theSpeed = 0;
    int carStrength = 0;

   
    public double getSpeed(){
        return theSpeed;
    }

    public void setSpeed(double speed){
        this.theSpeed = speed;
    }

    public int getWheel(){
        return numberOfWheels;
    }

    public void setWheels(int numWheels){
        this.numberOfWheels = numWheels;
    }

    public Vehicle(int wheels, double speed){
        this.numberOfWheels = wheels;
        this.theSpeed = speed;
    }

    
    public Vehicle(){

    }

   
    public void setCarStrength(int carStrength){
        this.carStrength = carStrength;
    }
    public int getCarStrength(){
        return this.carStrength;
    }
}
