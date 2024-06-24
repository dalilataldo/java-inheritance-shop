package org.java.inheritance.shop;

public class Cuffie extends Prodotto {
	
	String headphonesColour;
	String wirelessOrCablate;

Cuffie (String productName, String productBrand, double productPrice, int productIva, 
		String headphonesColour, String wirelessOrCablat, String wirelessOrCablate){
	
	super (productName, productBrand, productPrice, productIva);
	this.headphonesColour = headphonesColour;
	this.wirelessOrCablate = wirelessOrCablate;
		
}
	
	
}
