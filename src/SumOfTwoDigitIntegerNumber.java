public class SumOfTwoDigitIntegerNumber {
    public static void main(String[] args) {
        int number=Integer.parseInt(args[0]);
        int firstdigit=number/10;
        int lastdigit=number%10;
        int sum=firstdigit + lastdigit;
        System.out.println("Input of Two number"+number);
        System.out.println("First Digit is"+firstdigit);
        System.out.println("Last Digit is"+lastdigit);
        System.out.println("Sum of Digits"+sum);
    }
}