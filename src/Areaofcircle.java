public class Areaofcircle {
    public static void main(String[] args) {
        double p = 3.14;
        double r = Double.parseDouble(args[0]);
        if (r < 0) {
            System.out.println("Radius must be a non-negative number.");
        }
        else {
            double a = p * r * r;
            System.out.println("The area of the circle with radius is:" + a);
        }
    }
}
