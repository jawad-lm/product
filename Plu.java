package Plusystem;
public class Plu {
String name;
int expdate;
int plu;
String sku;
int upc;
int qty;
int currentdate;
double price;
public Plu(String name, int expdate, int plu, String sku, int upc, int qty, int currentdate, double price) {
	
	this.name = name;
	this.expdate = expdate;
	this.plu = plu;
	this.sku = sku;
	this.upc = upc;
	this.qty = qty;
	this.currentdate= currentdate;
	this.price = price;
	
}
//method to scan item and input expdate, name of item and qty of item
public void scannedItem() {
	System.out.println("this products price is $" +this.price );
	System.out.println("this product is called " +this.name ); 
		System.out.println("This product is exp date is " + this.expdate);
		System.out.println("Product amount is: " + this.qty);
		
}
void checkexpdate() {
	if (expdate < currentdate) {
		System.out.println("this product is expired!!! ");
		}
		else {
			System.out.println("this product is still good!!! ");
		}
	}
void total () {
	System.out.println("The total of this product is  $" + this.price * this.qty);
}
 




