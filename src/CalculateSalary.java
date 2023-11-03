public class CalculateSalary {
    public static void main(String args[]) {

        double Bsalary=Double.parseDouble(args[0]);
        System.out.println("Basic Salary is: Rs "+Bsalary);

        double HRA = Bsalary * 0.15;
        System.out.println("HRA is 15% of Basic Salary which is: Rs "+HRA);

        double Conveyence = Bsalary *0.15;
        System.out.println("Conveyence is 15% of Basic Salary which is: Rs "+Conveyence);

        double EA = Bsalary * 0.10;
        System.out.println("Entertainment Allowance is 10% of Basic Salary which is: Rs "+EA);

        //Calculate Total Salary

        double TotalSalary = Bsalary + HRA + Conveyence + EA ;

        //Print results
        System.out.println("Total Salary is: Rs "+TotalSalary);
    }
}