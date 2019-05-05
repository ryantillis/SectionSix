public class Main {

    public static void main(String[] args) {

        // Must initialize class with the new keyword.

        Car toyota = new Car();
        Car mercedes = new Car();

        toyota.setModel("Tacoma");
        System.out.println(toyota.getModel());

    }

}
