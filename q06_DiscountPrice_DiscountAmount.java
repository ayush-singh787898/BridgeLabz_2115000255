public class q06_DiscountPrice_DiscountAmount {
    public static void main(String[] args) {
        int fee=125000;
        int discountPercent=10;
        double discount=(discountPercent/100)*fee;
        double discountPrice=fee-discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountPrice);
    }
}
