package Practice;

public class Employee {

    private String firstName;
    private String secondName;
    private static int count = 0;

    public Employee(String firstName, String secondName){
        this.firstName =firstName;
        this.secondName = secondName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public static int getCount(){
        return count;
    }
}
