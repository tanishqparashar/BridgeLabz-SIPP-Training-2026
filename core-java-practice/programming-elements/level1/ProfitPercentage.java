package programmingelements.level1;

public class ProfitPercentage {
    public static void main(String[] args) {
        int costPrice=129;
        int sellingPrice=191;
        System.out.println("The Cost Price is INR 129 and Selling Price is INR 191");
        int profit=sellingPrice-costPrice;
        System.out.println("Your Profit is "+ profit);
        System.out.println("your profit % is "+ ((profit *100)/costPrice)+"%");
    }
}
