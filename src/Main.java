public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Nissan",320, 30000);
        Car car2 = new Car("Shoda", 240, 40000);
        try {
            car1.start();
        }catch (Exception e){
            System.out.println("Автомобиль " + car1.getMarka() + " не завёлся.");
        }
        try {
            car2.start();
        }catch (Exception e){
            System.out.println("Автомобиль " + car2.getMarka() + " не завёлся.");
        }

    }
}
