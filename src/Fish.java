public class Fish extends Animal {
        private int fins;
        private int eyes;


    public Fish(String name, int size, int weight, int fins, int eyes) {
        super(name, 1, 1, size, weight);
        this.fins = fins;
        this.eyes = eyes;
    }

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

}
