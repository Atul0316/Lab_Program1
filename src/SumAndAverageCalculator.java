public class SumAndAverageCalculator {
    public static void main(String[] args) {
        double x=Double.parseDouble(args[0]);
        double y=Double.parseDouble(args[1]);
        double z=Double.parseDouble(args[2]);
        double sum=x+y+z;
        System.out.println("Sum of the three numbers: "+sum);
        double a=sum/3;
        System.out.println("Average of the three numbers: "+a);

    }
}
