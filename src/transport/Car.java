package transport;

import java.sql.Struct;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Car {

    public static class Insurence {
        private Calendar insurenceDate;
        private double price;
        private String number;

        public Insurence(Calendar insuarenceDate, double price, String number) {
            if (insuarenceDate.getClass() == GregorianCalendar.class) {
                this.insurenceDate = insuarenceDate;
            } else {
                this.insurenceDate = GregorianCalendar.getInstance();
            }
            if (price > 0) {
                this.price = price;
            } else {
                this.price = 1;
            }
            if (!number.isBlank() && !number.isBlank() && !number.equals("")) {
                this.number = number;
            }
        }

        public Calendar getInsurenceDate() {
            return this.insurenceDate;
        }

        public double getPrice() {
            return price;
        }

        public String getNumber() {
            return this.number;
        }
    }

    public static class Keys {
        boolean remote;
        boolean withOutKeyAccess;

        @Override
        public String toString() {
            String rem = "нет";
            if (remote) {
                rem = "да";
            }
            String access = "нет";
            if (withOutKeyAccess) {
                access = "да";
            }
            return "Дистаноционный запуск: "
                    + rem +
                    ", бесключевой доступ: " + access;
        }

        public Keys(String remote, String withOutKeyAccess) {
            if (remote.toLowerCase().equals("дистанционный")) {
                this.remote = true;
            } else {
                this.remote = false;
            }
            if (withOutKeyAccess.toLowerCase().equals("бесключевой".toLowerCase())) {

                this.withOutKeyAccess = true;
            } else {
                this.withOutKeyAccess = false;
            }

        }

        public boolean isRemote() {
            return remote;
        }

        public boolean isWithOutKeyAccess() {
            return withOutKeyAccess;
        }
    }

    private Insurence insurence;
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    String transmisson;

    String bodyType;

    String registrationNumber;

    int seatPlaces;

    String rubberType;
    Keys keyType;


    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, String transmisson, String bodyType, String registrationNumber, int seatPlaces, String rubberType, Insurence insurence, Keys keyType) {
        if (brand != null) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (Double.compare(engineVolume, 0) != 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color != null) {
            this.color = brand;
        } else {
            this.color = "white";
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry != null) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = "default";
        }
        if (transmisson != null && !transmisson.isEmpty() && !transmisson.isBlank()) {
            if (transmisson.equals("Автомат") || transmisson.equals("Механика")) {
                this.transmisson = transmisson;
            } else {
                this.transmisson = "Коробка передач указана неверно";
            }
        } else {
            this.transmisson = "Автомат";
        }
        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            if (bodyType.equals("Седан") || bodyType.equals("Кроссовер")) {
                this.bodyType = bodyType;
            } else {
                this.bodyType = "Неизвестный тип кузова";
            }
        } else {
            this.bodyType = "Седан";
        }
        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "Без номера";
        }
        if (seatPlaces > 0) {
            this.seatPlaces = seatPlaces;
        } else {
            this.seatPlaces = 5;
        }
        if (rubberType != null && !rubberType.isEmpty() && !rubberType.isBlank()) {
            if (rubberType.equals("Зима") || rubberType.equals("Лето")) {
                this.rubberType = rubberType;
            } else {
                this.rubberType = "Неизвестный тип резины";
            }
        }
        this.insurence = insurence;
        this.keyType = keyType;

    }


    public void changeRubber() {
        if (LocalDate.now().getMonthValue() <= 2 || LocalDate.now().getMonthValue() >= 11) {
            this.rubberType = "Зима";

        } else {
            this.rubberType = "Лето";
        }
    }

    public void checkRegistrationNumber() {
        if (this.registrationNumber.toLowerCase().matches("[abceopkmhaxty][0-9][0-9][0-9][abceopkmhaxty][abceopkmhaxty][0-9][0-9][0-9]}")) {
            System.out.println("Номер соответствует стандарту");
        } else {
            System.out.println("Неверный госномер");
        }
    }

    public void checkInsuranceNumber() {
        if (this.insurence.number.length() != 9) {
            System.out.println("Неверный номер страховки");
        }
    }

    public void checkInsuranceActuality() {
        if (!this.insurence.insurenceDate.after(GregorianCalendar.getInstance())) {
            System.out.println("Страховка уже не действует");
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmisson() {
        return transmisson;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getSeatPlaces() {
        return seatPlaces;
    }

    public String getRubberType() {
        return rubberType;
    }

    public Calendar getInsDate() {
        return this.insurence.getInsurenceDate();
    }

    public Insurence getInsurence() {
        return this.insurence;
    }

    public Keys getKeyType() {
        return keyType;
    }

    public void setEngineVolume(double engineVolume) {
        if (Double.compare(engineVolume, 0) != 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setColor(String color) {
        if (color != null) {
            this.color = brand;
        } else {
            this.color = "white";
        }
    }


    public void setTransmisson(String transmisson) {
        if (transmisson != null && !transmisson.isEmpty() && !transmisson.isBlank()) {
            if (transmisson.equals("Автомат") || transmisson.equals("Механика")) {
                this.transmisson = transmisson;
            } else {
                this.transmisson = "Коробка передач указана неверно";
            }
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "Без номера";
        }
    }

    public void setRubberType(String rubberType) {
        if (rubberType != null && !rubberType.isEmpty() && !rubberType.isBlank()) {
            if (rubberType.equals("Зима") || rubberType.equals("Лето")) {
                this.rubberType = rubberType;
            } else {
                this.rubberType = "Неизвестный тип резины";
            }
        }
    }

    public void printCarInfo() {
        System.out.println("Aвтомобиль" +
                "марки " + brand +
                ", модель " + model +
                ", объем двигателя " + engineVolume +
                ", цвет " + color +
                ", год производства " + productionYear +
                ", страна сборки " + productionCountry
        );
    }
}
