import transport.Car;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import transport.Car;
public class Main {



    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia", "Автомат", "КУКУ", "k542ak038", 5, "Зима", new Car.Insurence(new GregorianCalendar(2022, Calendar.NOVEMBER, 1), 6000, "987654321"), new Car.Keys("дистанционный", "Бесключевой"));
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany", "Автомат", "Седан", "k543ak038", 5, "Зима", new Car.Insurence(new GregorianCalendar(2022, Calendar.APRIL, 1), 8000, "987654321"),  new Car.Keys("дистанционный", "Бесключевой"));
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany", "Автомат", "Седан", "k543ak039", 5, "Зиа", new Car.Insurence(new GregorianCalendar(2022, Calendar.NOVEMBER, 1), 6000, "987654321"),  new Car.Keys("дистанционный", "Бесключевой"));
        Car kiaSportage = new Car("KIA", "Sportage 4th gen", 2.4, "red", 2018, "South Korea", "Механика", "Седан", "k543ak038", 5, "Зима", new Car.Insurence(new GregorianCalendar(2022, Calendar.NOVEMBER, 1), 12000, "987654321"),  new Car.Keys("дистанционный", "Бесключевой"));
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea", "Автомат", "Седан", "а555ak038", 5, "Зима", new Car.Insurence(new GregorianCalendar(2022, Calendar.NOVEMBER, 1), 18000, "9876543214"),  new Car.Keys("дистанционный", "Бесключевой"));
        Car[] carsArray = {ladaGranta, audiA8, bmwZ8, kiaSportage, hyundaiAvante};
        bmwZ8.changeRubber();
        bmwZ8.printCarInfo();
        hyundaiAvante.checkRegistrationNumber();
        System.out.println(audiA8.getInsDate().before(GregorianCalendar.getInstance()));
        System.out.println(bmwZ8.getKeyType());
        hyundaiAvante.checkInsuranceNumber();
        audiA8.checkInsuranceActuality();
        ladaGranta.checkInsuranceActuality();
    }}
