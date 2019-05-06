public class Fish extends Animal {
        private int fins;
        private int eyes;
        private int fins;

    public Fish(String name, int size, int weight, int fins, int eyes, int fins1) {
        super(name, 1, 1, size, weight);
        this.fins = fins;
        this.eyes = eyes;
        this.fins = fins1;
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
