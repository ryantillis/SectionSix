public class Main {

    public static void main(String[] args) {

        // Must initialize class with the new keyword.

//        Car toyota = new Car();
//        Car mercedes = new Car();
//
//        toyota.setModel("Tacoma");
//        System.out.println(toyota.getModel());


        Account ryansAccount = new Account(12345, 0.00, "Doobie Doo", "doobiedoo@smoog.edu", "7049992889");

        System.out.println(ryansAccount.getBalance());
        ryansAccount.withdrawFunds(122);
        System.out.println(ryansAccount.getBalance());
        ryansAccount.depositFunds(555);
        System.out.println(ryansAccount.getBalance());

    }


}
