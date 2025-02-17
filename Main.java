import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalProducts = 0;
        while (true) {
            try {
                System.out.print("Enter the total number of products: ");
                totalProducts = Integer.parseInt(scanner.nextLine());
                if (totalProducts <= 0) {
                    System.out.println("Number of products must be positive.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        }

        String highestSellingProduct = "";
        double highestSales = 0.0;
        double totalSales = 0.0;

        for (int i = 1; i <= totalProducts; i++) {
            String productName;
            double sales = 0.0;

            System.out.print("Enter the name of product " + i + ": ");
            productName = scanner.nextLine();

            while (true) {
                try {
                    System.out.print("Enter the sales amount for " + productName + ": ");
                    sales = Double.parseDouble(scanner.nextLine());
                    if (sales < 0) {
                        System.out.println("Sales amount cannot be negative.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a numeric value.");
                }
            }

            totalSales += sales;

            // Check for highest-selling product
            if (sales > highestSales) {
                highestSales = sales;
                highestSellingProduct = productName;
            }
        }

        // Calculate average sales
        double averageSales = totalSales / totalProducts;

        // Display the sales report using a for loop
        System.out.println("\nSales Report (Using For Loop):");
        System.out.println("--------------------------------");
        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Average Sales: $" + String.format("%.2f", averageSales));
        System.out.println("Highest-Selling Product: " + highestSellingProduct + " with sales of $" + highestSales);

        // Display the sales report using a while loop
        System.out.println("\nSales Report (Using While Loop):");
        System.out.println("--------------------------------");
        int count = 0;
        while (count < 1) {
            System.out.println("Total Sales: $" + totalSales);
            System.out.println("Average Sales: $" + String.format("%.2f", averageSales));
            System.out.println("Highest-Selling Product: " + highestSellingProduct + " with sales of $" + highestSales);
            count++;
        }

        scanner.close();
    }
}
