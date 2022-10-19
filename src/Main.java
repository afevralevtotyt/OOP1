public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia");
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany");
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany");
        Car kiaSportage = new Car("KIA", "Sportage 4th gen", 2.4, "red", 2018, "South Korea");
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea");
        Car a4 = new Car(null, "a4", 0, null, 0, null);
        Car [] carsArray = {ladaGranta, audiA8, bmwZ8, kiaSportage, hyundaiAvante, a4};

        for (Car car: carsArray) {
            car.printCarInfo();
        }

}}