class ZomatoBill {
    public static void main(String args[]) {
       
        String restaurantName = "Foodie Hub";
        String customerName = "Prabhakar";
        int Bill_number=301;

        
        String item1 = "Pizza";
        int quantity1 = 2;
        float price1 = 300.20f;

        String item2 = "Burger";
        int quantity2 = 1;
        float price2 = 150.50f;

        String item3 = "Fries";
        int quantity3 = 1;
        float price3 = 80.50f;

        
        float deliveryCharge = 50.00f;
        float gstRate = 5.0f; 


        float totalCost = (quantity1 * price1) + (quantity2 * price2) + (quantity3 * price3);
        float gstAmount = (totalCost * gstRate) / 100;
        float totalWithTax = totalCost + gstAmount + deliveryCharge;

               
        String paymentMethod = "PhonePe";
        float paymentDiscount = 0.0f;

        if (paymentMethod=="PhonePe") {
            paymentDiscount = (totalWithTax * 5) / 100; 
        } else if (paymentMethod=="GPay") {
            paymentDiscount = (totalWithTax * 3) / 100; 
        } else if (paymentMethod=="Paytm"){
            paymentDiscount = (totalWithTax * 2) / 100;
        }

       
        double finalAmount = totalWithTax - paymentDiscount;

    
        System.out.println("ZOMATO BILL");
        System.out.println("----------------------------");
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Customer: " + customerName);
        System.out.println("\nItems Ordered:");
        System.out.println("Bill_number"+Bill_number);
        System.out.println(item1 + " (" + quantity1 + ") " + (quantity1 * price1));
        System.out.println(item2 + " (" + quantity2 + ")  " + (quantity2 * price2));
        System.out.println(item3 + " (" + quantity3 + ")  " + (quantity3 * price3));

        System.out.println("\nTotal Cost: " + totalCost);
        System.out.println("GST (5%): " + gstAmount);
        System.out.println("Delivery Charge: " + deliveryCharge);
        System.out.println(paymentMethod + " Discount: " + paymentDiscount);
        System.out.println("\nFinal Amount: " + finalAmount);
        System.out.println("\nThank you for ordering in Zomato");
  
        }
        }
