public class CarClass extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public CarClass(String name, String size, int currentVelocity, int currentDirection, int wheels, int doors, int gears, boolean isManual, int currentGear) {
        super(name, size, currentVelocity, currentDirection);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void setCurrentGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Gear changed to " + this.currentGear);
    }

    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("Car vel " + speed + " direction " + direction);
    }


}
