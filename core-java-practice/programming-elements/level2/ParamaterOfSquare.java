package programmingelements.level2;
import java.util.Scanner;

public class ParamaterOfSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the parameter of the Squre ->  ");
        int parameter=sc.nextInt();
        System.out.println("The length of the side is "+ parameter/4 +" whose perimeter is "+parameter);
    }
}
