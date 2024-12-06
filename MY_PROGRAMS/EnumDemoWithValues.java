package MY_PROGRAMS;

enum Laptop {
    OMEN(80000), LEGION(75000), MACBOOK(90000), INSPIRON(45000), VICTUS(55000), TUF(60000), PAVILION(56000), ASPIRE(56000);

    private final int price;

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class EnumDemoWithValues {
    public static void main(String[] args) {
        Laptop[] lap = Laptop.values();
        for(Laptop model : lap) {
            System.out.println("Model : " + model + " & Price : " + model.getPrice());
        }
    }
}