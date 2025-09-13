package com.driver;

public class Main {

    public static class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();

        int result1 = p.product(3, 4);
        int result2 = p.product(2, 3, 4);
        double result3 = p.product(2.5, 4.0);

        System.out.println("Product of 3 and 4: " + result1);
        System.out.println("Product of 2, 3 and 4: " + result2);
        System.out.println("Product of 2.5 and 4.0: " + result3);
    }
}