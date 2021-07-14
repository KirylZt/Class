import java.util.Random;

public class Car {
    private String marka;
    private int speed;
    private int price;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(String marka, int speed, int price) {
        this.marka = marka;
        this.speed = speed;
        this.price = price;
    }

    public void start() throws Error {
        Random random = new Random();
        int value = random.nextInt(21);
        if (value % 2 == 0){
            throw new Error(value);
        }else {
            System.out.println("Автомобиль " + marka + " успешно завёлся.");
        }
    }
}
