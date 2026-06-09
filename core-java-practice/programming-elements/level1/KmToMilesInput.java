package programmingelements.level1;
import java.util.Scanner;

public class KmToMilesInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of km");
        double km=sc.nextInt();
        System.out.println("The total miles is "+km*1.6  +" mile for the given "+km+"km");
        sc.close();

    }
}
