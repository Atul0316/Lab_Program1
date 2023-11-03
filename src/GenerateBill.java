public class GenerateBill {

    public static void main(String args[]) {
        double cc=60*4;
        double cv=25*3;
        double total=cc+cv;
        double d=50;
        double f=total-d;
        System.out.println("Itemized Bill:");
        System.out.println("Cost of Chicken Rolls: Rs"+cc);
        System.out.println("Cost of Vegitable Puffs: Rs"+cv);
        System.out.println("Total Bill Before Discount: Rs"+total);
        System.out.println("Yoga Day Discount: Rs:"+d);
        System.out.println("Final Bill after Discount: Rs"+f);
    }
}
