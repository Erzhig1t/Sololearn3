package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car1 = new Car(23, "A1205");
        Car car2 = new Car(12, "B2367");
        Car car3 = new Car(45, "B0306");

        CarInfo carInfo1 = new CarInfo("2015", "Audi A6", 15000, "White");
        CarInfo carInfo2 = new CarInfo("2018", "Mercedes E-200", 20000, "Black");
        CarInfo carInfo3 = new CarInfo("2022", "Honda Accord", 12000, "Red");

        Map<Car, CarInfo> map = new LinkedHashMap<>();
        map.put(car1, carInfo1);
        map.put(car2, carInfo2);
        map.put(car3, carInfo3);

        for (Map.Entry a: map.entrySet()) {
            System.out.println(a.getKey()+" "+ a.getValue());
        }

    }
}





