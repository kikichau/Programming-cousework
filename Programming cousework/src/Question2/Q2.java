package Question2;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter Total Cholesterol(TC): ");
        double TC = input.nextDouble();
        System.out.print("Please enter HDL cholesterol(HDLC): ");
        double HDLC = input.nextDouble();
        System.out.print("Please enter Triglycerides(TG): ");
        double TG = input.nextDouble();
        double LDLC = TC - HDLC - (TG/5);
        System.out.println("The LDL cholesterol (LDLC) is: "+LDLC);
    }
}