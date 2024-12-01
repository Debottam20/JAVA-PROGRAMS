package MY_PROGRAMS;

class Employee {
    private int id;
    private String name;

    public void setid(int n) {
        id = n;
    }

    public int getid() {
        return id;
    }

    public void setname(String s) {
        name = s;
    }

    public String getname() {
        return name;
    }
}

public class GetAndSet {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setid(19);
        obj.setname("Debottam");
        System.out.println("Id = " + obj.getid());
        System.out.println("Name = " + obj.getname());
    }
}