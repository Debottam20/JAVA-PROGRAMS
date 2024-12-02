package MY_PROGRAMS;

class Employee {
    private int id;
    private String name;

    public void setID(int n) {
        id = n;
    }

    public int getID() {
        return id;
    }

    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }
}

public class GetterAndSetter {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setID(19);
        obj.setName("Debottam");
        System.out.println("ID = " + obj.getID());
        System.out.println("Name = " + obj.getName());
    }
}