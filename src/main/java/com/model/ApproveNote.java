package com.model;

public class ApproveNote {
	
	private int idsupplier;
	private String productId;
	private String description;
	private String quantity;
	private String price;
	private String date;
	private String location;
	
	
	public ApproveNote(int idsupplier, String productId, String description, String quantity, String price, String date,
			String location) {
		super();
		this.idsupplier = idsupplier;
		this.productId = productId;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.date = date;
		this.location = location;
	}
	
	
	public int getIdsupplier() {
		return idsupplier;
	}
	public void setIdsupplier(int idsupplier) {
		this.idsupplier = idsupplier;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	
}
