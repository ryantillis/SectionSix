
//statement to create new class in car
//Access modifier, Public, Private, Protected

public class Car {

    //Class is a blueprint or template for creating objects
        private int doors;
        private int wheels;
        private String model;
        private String engine;
        private String color;


        //Validation for data types can be stored in the object itself making it impossible to create an invalid object. This is the basic concept of encapsulation
        public void setModel(String model) {

            String validModel = model.toLowerCase();
            if (validModel.equals("tacoma") || validModel.equals("tundra")) {
                this.model = model;
            } else {
                this.model = "Unknown";
            }
        }

        public String getModel(){
            return this.model;
        }

}
