public class Mercedes extends CarClass {
    private String model;
    private int year;

    public Mercedes(String model, int year) {
        super("Mercedes", "Sudan", 0, 0, 4, 4, 5, false, 1);
        this.model = model;
        this.year = year;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity = 0){stop();}else if(newVelocity > 0 && newVelocity <= 20) {setCurrentGear(2);}
        if(newVelocity > 0){
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }

    @Override
    public void stop() {
        super.stop();
    }

}
