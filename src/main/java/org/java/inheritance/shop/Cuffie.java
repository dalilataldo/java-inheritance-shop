package org.java.inheritance.shop;

public class Cuffie extends Prodotto {
	
	String HeadphonesColour = "red";
	String WirelessOrCablate = "Wireless";

	Cuffie (String productName, String productBrand, double productPrice, int productIva){
		
		super (productName, productBrand, productPrice, productIva);
	}
	
	
}
