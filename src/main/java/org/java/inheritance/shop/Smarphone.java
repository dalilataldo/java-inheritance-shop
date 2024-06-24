package org.java.inheritance.shop;


public class Smarphone extends Prodotto {
	
	int ImeiCode;
	int phoneGigaMemory;
	
Smarphone (String productName, String productBrand, double productPrice, int productIva, int ImeiCode, int phoneGigaMemory){
	
	super (productName, productBrand, productPrice, productIva);
	this.ImeiCode = ImeiCode;
	this.phoneGigaMemory = phoneGigaMemory;
}


}

