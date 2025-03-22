class Myproduct
{
public static void main(String args[])
{
String Store_name="SHOPzONE";
String Product_name="Handy_books";
char Product_category_code='B';
boolean Product_Available=true;
int Product_id=5001;
short Quantity=15;
float Price=59.99f;
byte Notebook_rating=5;
long deliveryId = 202410250001l;

double total_price=Quantity*Price; //price is of float
System.out.println("Total Price of books is : "+total_price);

double discount=15.0; //DISCOUNT
double price_after_discount=total_price-(total_price*0.10);
System.out.println("Price after "+discount+" % discount is: "+price_after_discount);

double coupan_discount=5.3f; //COUPAN DISCOUNT
double price_after_coupan_discount=(float)(price_after_discount-coupan_discount); //implicit
System.out.println("Price after "+coupan_discount+" coupan discount is : "+price_after_coupan_discount);

double tax_rate=10.0; //TAX
double tax_amount=((price_after_coupan_discount*tax_rate)/100)+price_after_coupan_discount;
System.out.println("Price after "+tax_rate+ " tax is : "+tax_amount);

float delivery_charges=(int)15.7f;
double price_after_delivery_charges=tax_amount+delivery_charges;
System.out.println("Price of Product with  15 delivery charges is :" +price_after_delivery_charges);


String paymentmethod="Gpay";

if(paymentmethod=="Gpay")
{
double final_price=price_after_delivery_charges-(price_after_delivery_charges*5)/100;
System.out.println("Hence you used the Gpay you get discount of 5% the final price is: "+final_price);
}

else
{
System.out.println("Final price youll need to pay is:"+price_after_delivery_charges);


}

System.out.println("=======PRODUCT SUMMARY=======");
System.out.println("Store Name: " + Store_name);
System.out.println("Product Name: " + Product_name);
System.out.println("Product Category Code: " + Product_category_code);
System.out.println("Product Available: " + Product_Available);
System.out.println("Product ID: " + Product_id);
System.out.println("Quantity: " + Quantity);
System.out.println("Price per Notebook: ₹" + Price);
System.out.println("Notebook Rating: " + Notebook_rating + " Stars");
System.out.println("Delivery ID: " + deliveryId);

}
}