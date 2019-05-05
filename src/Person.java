public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        if(age < 0 || age > 100){return 0;} else{return this.age;}
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isTeen(){
        if(this.age > 12 && this.age < 20){
            return true;
        } else {return false;}

    }

    public String getFullName(){
        if(lastName.isEmpty() && firstName.isEmpty()){return "";}
        else if(lastName.isEmpty()) {return firstName;}
        else if(firstName.isEmpty()){return lastName;}
        else{
            return this.firstName + " " + this.lastName;
        }
    }

}
