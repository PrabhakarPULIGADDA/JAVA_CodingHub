class Main {
    public static void main(String args[]) {
        String shop_name = "Shoppy";
        String Product_name="Tshirts";
        char category = 'A';
        int productCode = 28;
        float price = 150.5f;
        short quantity = 10;
        boolean product_available = true;


        long total = (long) (price * quantity);
        System.out.println("Total Price: " + total);

        byte discountPercentage = 10;
        double discount = total * ((double) discountPercentage / 100);
        System.out.println("Discount: " + discount);

        double couponDiscount = 5.0;
        System.out.println("Coupon Discount: " + couponDiscount);

        double discountedTotal = total - discount - couponDiscount;
        System.out.println("Total After All Discounts: " + discountedTotal); 

        double tax = 20.81;
        System.out.println("Tax: " + tax);

        double finalAmount = discountedTotal + tax;
        System.out.println("Final Payable Amount: " + (int) finalAmount);
    
        String payment_method="Phonepay";   
        
        if (payment_method=="Phonepay")
        {
         System.out.println(finalAmount-10+"you are used phone pay hence final Amount payable")
        }
        else
        {
         System.out.println("Amount payable"+finalAmount);
        }


        System.out.println("\n Product Summary\n");
        System.out.println("Product Name: " + Product_name);
        System.out.println("Category: " + category);
        System.out.println("Product Code: " + productCode);
        System.out.println("Quantity: " + quantity);
        System.out.println("Available: " + product_available);
    }
}
