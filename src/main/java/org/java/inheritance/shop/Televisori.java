package org.java.inheritance.shop;

public class Televisori extends Prodotto {
	
	double TvHighSize = 40.40;
	double TvLargeSize = 50.50;
	boolean TvSmart = true;
	
	Televisori (String productName, String productBrand, double productPrice, int productIva){
		
		super (productName, productBrand, productPrice, productIva);
	
	}
	
	
}


