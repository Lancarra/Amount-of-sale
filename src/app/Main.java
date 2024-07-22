package app;

public class Main {

    public static void main(String[] args) {

        // Definition of variables for the first product
        String productName1 = "Smartphone";     //Name of product
        double price1 = 2430.68;        //Product price
        int quantity1 = 5;      //Quantity of sales days
        double totalSales1 = calculateTotalSales(quantity1, price1);        //Total sales for all days
        double dailySales1 = calculateDailySales(totalSales1, quantity1);       //Sales per day
        //Output of information about the first product
        System.out.printf("Product No 1: %s;\nTotal sales for %d days is EUR %.2f;\nSales by day is EUR %.2f.%n\n",
                productName1, quantity1, totalSales1, dailySales1);

        // Definition of variables for the second product
        String productName2 = "Laptop";     //Name of product
        double price2 = 1498.12;        //Product price
        int quantity2 = 7;       //Quantity of sales days
        double totalSales2 = calculateTotalSales(quantity2, price2);        //Total sales for all days
        double dailySales2 = calculateDailySales(totalSales2, quantity2);       //Sales per day
        //Output of information about the second product
        System.out.printf("Product No 2: %s;\nTotal sales for %d days is EUR %.2f;\nSales by day is EUR %.2f.%n",
                productName2, quantity2, totalSales2, dailySales2);
    }

    //Method for calculation total sales
    public static double calculateTotalSales(int quantity, double price) {
        return quantity * price;        // Total sales = number of days * price
    }

    //Method for calculating daily sales
    public static double calculateDailySales(double totalSales, int days) {
        return totalSales / days;       // Daily sales = total sales / number of days
    }
}