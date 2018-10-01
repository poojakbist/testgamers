package com.clan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clanproduct")
public class Product {

	@Id
	@Column(name = "Id")
	private String productId;

	@Column(name = "category")
	private String productCategory;

	@Column(name = "description")
	private String productDescription;

	@Column(name = "manufacturer")
	private String productManufacturer;

	@Column(name = "name")
	private String productName;

	@Column(name = "price")
	private double productPrice;

	@Column(name = "unit_stock")
	private String unitStock;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getUnitStock() {
		return unitStock;
	}

	public void setUnitStock(String unitStock) {
		this.unitStock = unitStock;
	}

	public Product(String productId, String productCategory, String productDescription, String productManufacturer,
			String productName, double productPrice, String unitStock) {
		super();
		this.productId = productId;
		this.productCategory = productCategory;
		this.productDescription = productDescription;
		this.productManufacturer = productManufacturer;
		this.productName = productName;
		this.productPrice = productPrice;
		this.unitStock = unitStock;
	}

	public Product() {
	}

	/*
	 * _______________________________________________________________________________________________________
	 * 
	 * @Id private int pid; private String name; private String brand; private int
	 * stock; private String description; private double price;
	 * 
	 * public Product(int pid,String name, String brand, int stock, String
	 * description, double price) { this.pid=pid; this.name = name; this.brand =
	 * brand; this.stock = stock; this.description = description; this.price =
	 * price; }
	 * 
	 * public Product() {
	 * 
	 * }
	 * 
	 * public int getPid() { return pid; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public String getBrand() { return brand; }
	 * 
	 * public int getStock() { return stock; }
	 * 
	 * public String getDescription() { return description; }
	 * 
	 * public double getPrice() { return price; }
	 */

}
