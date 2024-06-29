package com.syntexpro;

public class ShopApp {
    public static void main(String[] args) {

        Customer c1 = new Customer();

        c1.setName("John");

        int measurement = 3;        // Setting size of the customer based on the measurement value

        System.out.println("Hello, " + c1.getName() + "!");     // Greeting message
    }

    public static void setSizeBasedOnMeasurement(Customer customer, int measurement) {
        switch (measurement) {
            case 1:
                customer.setSize("S");
                break;
            case 2:
                customer.setSize("M");
                break;
            case 3:
                customer.setSize("L");
                break;
            default:
                customer.setSize("X");
                break;
        }
    }


}

