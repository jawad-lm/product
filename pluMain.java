package Plusystem;

import java.util.Scanner;

public class pluMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
		int expdate;
		int plu = 0;
		String sku = null;
		int upc = 0;
		int qty;
		int currentdate = 20210417;
		double price;
		
		
		Scanner input= new Scanner (System.in);
		System.out.println("Whats the expiry date? ex:(20200420) ");
		expdate = input.nextInt();
		System.out.println("Whats the quantity? ");
		qty = input.nextInt();
		System.out.println("how much does it cost? ");
		price = input.nextDouble();
		//String name, int expdate, int plu, String sku, int upc, int qty, int currentdate )
		Plu  scan = new Plu(name, expdate, plu, sku, upc, qty, currentdate, price);
		scan.scannedItem();
		scan.checkexpdate();
		
	}

}
