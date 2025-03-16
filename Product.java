class Product {
    public static void main(String args[]) {
        String name = "Vishal";
        int productCode = 28;
        int price = 10;
        int quantity = 10;
        int total = price * quantity;
        System.out.println("Total Price: " + total);
        double discount = (double) total * 0.10;
        System.out.println("Discount: " + discount);
        double couponDiscount = 10;
        System.out.println("Coupon Discount: " + couponDiscount);
        double discountedTotal = total - discount - couponDiscount;
        System.out.println("Total After Discounts: " + discountedTotal);
        double tax = discountedTotal * 0.18;
        System.out.println("Tax: " + tax);
        double finalAmount = discountedTotal + tax;
        System.out.println("Final Payable Amount: " + (int) finalAmount);
    }
}
