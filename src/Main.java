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

        VipCustomer ryan = new VipCustomer();
        System.out.println(ryan.getName());

        VipCustomer bob = new VipCustomer("Bob", "bob@me.com");
        System.out.println(bob.getName());

        VipCustomer jay = new VipCustomer("jay", "jay@me.com", 2000);
        System.out.println(jay.getName());
        System.out.println(jay.getEmail());
        System.out.println(jay.getCreditLimit());
    }


}
