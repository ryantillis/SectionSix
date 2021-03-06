public class Main {

    public static void main(String[] args) {

        // Must initialize class with the new keyword.

//        Car toyota = new Car();
//        Car mercedes = new Car();
//
//        toyota.setModel("Tacoma");
//        System.out.println(toyota.getModel());


//        Account ryansAccount = new Account(12345, 0.00, "Doobie Doo", "doobiedoo@smoog.edu", "7049992889");
//
//        System.out.println(ryansAccount.getBalance());
//        ryansAccount.withdrawFunds(122);
//        System.out.println(ryansAccount.getBalance());
//        ryansAccount.depositFunds(555);
//        System.out.println(ryansAccount.getBalance());
//
//
//        Account bobsAccount = new Account("Bob", "bob@me.com", "12345");
//        System.out.println(bobsAccount.getEmail() + " " + bobsAccount.getCustomerName());

//        VipCustomer ryan = new VipCustomer();
////        System.out.println(ryan.getName());
////
////        VipCustomer bob = new VipCustomer("Bob", "bob@me.com");
////        System.out.println(bob.getName());
////
////        VipCustomer jay = new VipCustomer("jay", "jay@me.com", 2000);
////        System.out.println(jay.getName());
////        System.out.println(jay.getEmail());
////        System.out.println(jay.getCreditLimit());

//        Wall wall = new Wall(5,4);
//        System.out.println("area = " + wall.getArea());
//
//        wall.setHeight(-1.5);
//
//        System.out.println("width = " + wall.getWidth());
//        System.out.println("height = " + wall.getHeight());
//        System.out.println("area = " + wall.getArea());

//        Point first = new Point(6,5);
//        Point second = new Point(3,1);
//
//        System.out.println("dist0,0 = " + first.distance());
//        System.out.println("dist2nd = " + first.distance(second));
//        System.out.println("dist22 = " + first.distance(2,2));
//
//        Point point = new Point();
//        System.out.println("dist = " + point.distance());


//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println("total = " + calculator.getTotalCost());
//
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4,4.5);
//        calculator = new Calculator(floor,carpet);
//        System.out.println("total = " + calculator.getTotalCost());

//        ComplexNumber one = new ComplexNumber(1.0,1.0);
//        ComplexNumber number = new ComplexNumber(2.5, -1.5);
//        one.add(1,1);
//        System.out.println("one.real = " + one.getReal());
//        System.out.println("one.imaginary = " + one.getImaginary());
//        one.subtract(number);
//        System.out.println("one.real = " + one.getReal());
//        System.out.println("one.imaginary = " + one.getImaginary());
//        number.subtract(one);
//        System.out.println("number.real = " + number.getReal());
//        System.out.println("number.imaginary = " + number.getImaginary());

//        Animal animal = new Animal("Animal", 1,1,5,5);
//        Dog dog = new Dog("Yorkie", 8,20,2,20,2,4,1,20, "Shoob");
//
//
//        dog.eat();
//        dog.walk();
//        dog.run();

        House blueHouse = new House("blue");
        House anotherHouse = blueHouse; //Still one house, multiple references to the same object in memory


        System.out.println(blueHouse.getColor()); //same color because it is the same reference
        System.out.println(anotherHouse.getColor());


        anotherHouse.setColor("red"); //Setting color for a single reference changes it for the original object/instance
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());


        House greenHouse = new House("green");//Changes reference to greenhouse
        anotherHouse = greenHouse;
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());
        System.out.println(greenHouse.getColor());


    }


}
