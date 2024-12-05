package MY_PROGRAMS;
import java.util.*;

enum States {
    NEW,READY,RUNNING,WAITING,TERMINATED
}

class AllEnums {
    public void printAllEnums() {
        States[] s = States.values();
        for (States state : s) {
            System.out.println("Current state is : " + state + " & order is : " + state.ordinal());
        }
    }
}

class EnumWithSwitch {
    States state;
    public EnumWithSwitch(States st) {
        this.state = st;
    }
    public void check() {
        switch (state) {
            case NEW:
                System.out.println("New process created");
                break;
            case READY:
                System.out.println("Process is ready to be executed");
                break;
            case RUNNING:
                System.out.println("The process is executing");
                break;
            case WAITING:
                System.out.println("The process is waiting for something");
                break;
            case TERMINATED:
                System.out.println("Process completed its execution");
                break;
            default:
                System.out.println("Enter valid state name in all caps");
        }
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AllEnums e = new AllEnums();
        System.out.println("The enums are : ");
        e.printAllEnums();
        System.out.println("Enter the current known state in all caps : ");
        String currState = in.next();
        EnumWithSwitch obj = new EnumWithSwitch(States.valueOf(currState));
        obj.check();
    }
}