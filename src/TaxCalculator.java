public class TaxCalculator {
    public static void main(String[] args) {
        double income=990000.0;
        double r=4.9;
        double a=income*r/100;
        System.out.println("Taxable Income: Rs"+income);
        System.out.println("Tax Rate:"+r);
        System.out.println("Tax Amount: Rs"+a);
    }
}