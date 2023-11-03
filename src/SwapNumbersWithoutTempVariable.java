public class SwapNumbersWithoutTempVariable {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println("java Swap Numbers Without Temp Variable"+a +b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Swapped Values:"+a+b);


    }
}
