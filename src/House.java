public class House {

    //Class is a blueprint
    //Each house built is an object or instance
    //Each house has an address or a reference
    //This reference can be copied as many times as you like but there is only 1 house
    //references can be parameters to constructors and methods

    private String color;

    public House(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
