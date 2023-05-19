public class Car {
    private String brand;
    private String model;
    private int year;
    
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    public void start_engine() {
        System.out.println("Car engine started");
    }
    
    public void stop_engine() {
        System.out.println("Car engine stopped");
    }
    
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "supramk4", 2022);
        myCar.start_engine();
        myCar.stop_engine();
    }
}
