package com.company;

public class TestDate {

    public static void main(String[] args) {


        MyDate date = new MyDate(8,3, 2022); // Today´s date
        System.out.println(date);

        date.setToNextDay(); // dagen efter
        System.out.println("Burde være 9/3/2022 " + date);

        date.setToNextDay(); // dagen efter der igen, den skal opdatere korrekt
        System.out.println("Burde være 10/3/2022 " + date);

        System.out.println(" ");
        MyDate dateTest = new MyDate(28,2, 2022);
        System.out.println("Check af månedsskifte feb/mars: ");
        System.out.println(dateTest);
        dateTest.setToNextDay(); // dagen efter
        System.out.println(dateTest);

        System.out.println(" ");
        MyDate dateTest2 = new MyDate(31,3, 2022);
        System.out.println("Check af månedsskifte marts/april: ");
        System.out.println(dateTest2);
        dateTest2.setToNextDay(); // dagen efter
        System.out.println(dateTest2);

        System.out.println(" ");
        MyDate dateTest3 = new MyDate(31,12, 2022);
        System.out.println("Check af årsskifte dec/jan: ");
        System.out.println(dateTest3);
        dateTest3.setToNextDay(); // dagen efter
        System.out.println(dateTest3);

        System.out.println(" ");
        MyDate dateTest4 = new MyDate(28,2, 2024); // næste skudårsdag
        System.out.println("Check af skudårsdag: ");
        System.out.println(dateTest4);
        dateTest4.setToNextDay(); // dagen efter
        System.out.println("Burde være 29.2.2024 " + dateTest4);
        dateTest4.setToNextDay(); // dagen efter
        System.out.println("Burde være 1.3.2024 " + dateTest4);



    }

}
