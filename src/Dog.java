public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        //Super calls constructor from the inherited (extended) class
        super(name, 1, 1, size, weight);
        this.coat = coat;
        this.eyes = eyes;
        this.tail = tail;
        this.teeth = teeth;
        this.legs = legs;

    }

    private void chew(){
        System.out.println("Dog.chew called.");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat called.");
        chew(); // If a dog eats then it chews
        super.eat(); //super class is animal and the method is called from inherited class
    }

    public void walk(){
        System.out.println("dog.Walk called.");
        move(5);
    }

    public void run(){
        System.out.println("dog.run called.");
        move(10); //withotu designating super() the method will call the move method within the Dog class which includes moveLegs
    }

    public void moveLegs(int speed){
        System.out.println("dog.moveLegs called.");
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move called.");
        moveLegs(speed);
        super.move(speed);
    }
}
