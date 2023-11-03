public class TVSetProfitCalculator {
    public static void main(String[] args) {
        double costPrice = 32500.0;
        double profitPercentage = 27.0;
        double vatPercentage = 12.7;
        double serviceChargePercentage = 3.87;
        double profit = (profitPercentage / 100) * costPrice;
        double sellingPrice = costPrice + profit;
        double vatAmount = (vatPercentage / 100) * sellingPrice;
        double serviceChargeAmount = (serviceChargePercentage / 100) * sellingPrice;
        double totalSellingPrice = sellingPrice + vatAmount + serviceChargeAmount;
        System.out.println("Cost Price: Rs. " + costPrice);
        System.out.println("Profit: Rs. " + profit);
        System.out.println("VAT: Rs. " + vatAmount);
        System.out.println("Service Charge: Rs. " + serviceChargeAmount);
        System.out.println("Total Selling Price: Rs. " + totalSellingPrice);
    }
}
