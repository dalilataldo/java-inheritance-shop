package org.java.inheritance.shop;

public class Televisori extends Prodotto {
	
	double TvHighSize;
	double TvLargeSize;
	boolean TvSmart;
	
Televisori (String productName, String productBrand, double productPrice, int productIva, 
		double TvHighSize, double TvLargeSize, boolean TvSmart){
	
	super (productName, productBrand, productPrice, productIva);
	this.TvHighSize = TvHighSize;
	this.TvLargeSize = TvLargeSize;
	this.TvSmart = TvSmart;
}
	
	
}


