package org.java.inheritance.shop;
	
import java.util.Random;

public class Prodotto {

	// variabili di istanza
	private int productCode;
	private String productName;
	private String productBrand;
	private double productPrice;
	private int productIva;
		
	//costruttore
	public Prodotto (String productName, String productBrand, double productPrice, int productIva){

	Random random = new Random ();
			
	this.productCode = random.nextInt(9999);
	this.productName = productName;
	this.productBrand = productBrand;
	this.productPrice = productPrice;
	this.productIva = productIva; 
	}
		
	//getter e setter (productCode solo in lettura)
	public int getProductCode() {
	return productCode;
	}
		
	public String getProductName() {
		return productName;
	}
	
	public String getProductBrand() {
		return productBrand;
	}
	
	public double getProductPrice() {
		return productPrice;
	}
	
	public int getProductIva() {
		return productIva;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
		
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public void setProductIva(int productIva) {
		this.productIva = productIva;
	}

}
