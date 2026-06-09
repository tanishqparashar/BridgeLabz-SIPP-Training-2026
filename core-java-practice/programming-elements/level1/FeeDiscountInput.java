package programmingelements.level1;
import java.util.Scanner;

public class FeeDiscountInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the fee of Student");
        int fee=sc.nextInt();
        System.out.println("Enter the Discount on fee");
        float discount=sc.nextInt();
        float disountOnFee=(fee*discount)/100;
        float totalfee=fee-disountOnFee;
        System.out.println("The discount amount is INR "+ disountOnFee+" and final discounted fee is INR "+totalfee);
        sc.close();


    }
}
